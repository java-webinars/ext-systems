package edu.javacourse.city.dao;

import edu.javacourse.city.domain.PersonRequest;
import edu.javacourse.city.domain.PersonResponse;
import edu.javacourse.city.exception.PersonCheckException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonCheckDao
{
    private static final String SQL_REQUEST =
            "select temporal from cr_address_person ap " +
                    "inner join cr_person p on p.person_id = ap.person_id " +
                    "inner join cr_address a on a.address_id = ap.address_id " +
                    "where " +
                    "CURRENT_DATE >= ap.start_date and (CURRENT_DATE <= ap.end_date or ap.end_date is null)" +
                    "and upper(p.sur_name COLLATE \"en_US.UTF-8\") = upper(? COLLATE \"en_US.UTF-8\")  " +
                    "and upper(p.given_name COLLATE \"en_US.UTF-8\") = upper(? COLLATE \"en_US.UTF-8\")  " +
                    "and upper(patronymic COLLATE \"en_US.UTF-8\") = upper(? COLLATE \"en_US.UTF-8\")  " +
                    "and p.date_of_birth = ? " +
                    "and a.street_code = ?  " +
                    "and upper(a.building COLLATE \"en_US.UTF-8\") = upper(? COLLATE \"en_US.UTF-8\")  ";

    public PersonCheckDao() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public PersonResponse checkPerson(PersonRequest request) throws PersonCheckException {
        PersonResponse response = new PersonResponse();

        String sql = SQL_REQUEST;
        if (request.getExtension() != null) {
            sql += "and upper(a.extension COLLATE \"en_US.UTF-8\") = upper(? COLLATE \"en_US.UTF-8\")  ";
        } else {
            sql += "and extension is null ";
        }
        if (request.getApartment() != null) {
            sql += "and upper(a.apartment COLLATE \"en_US.UTF-8\") = upper(? COLLATE \"en_US.UTF-8\") ";
        } else {
            sql += "and a.apartment is null ";
        }

        try (Connection con = getConnection();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            int count = 1;
            stmt.setString(count++, request.getSurName());
            stmt.setString(count++, request.getGivenName());
            stmt.setString(count++, request.getPatronymic());
            stmt.setDate(count++, java.sql.Date.valueOf(request.getDateOfBirth()));
            stmt.setInt(count++, request.getStreetCode());
            stmt.setString(count++, request.getBuilding());
            if (request.getExtension() != null) {
                stmt.setString(count++, request.getExtension());
            }
            if (request.getApartment() != null) {
                stmt.setString(count++, request.getApartment());
            }

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                response.setRegistered(true);
                response.setTemporal(rs.getBoolean("temporal"));
            }
        } catch(SQLException ex) {
            throw new PersonCheckException(ex);
        }

        return response;
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://localhost/city_register",
                "postgres", "postgres");
    }
}
