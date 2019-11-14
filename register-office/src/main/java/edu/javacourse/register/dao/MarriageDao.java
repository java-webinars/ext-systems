package edu.javacourse.register.dao;

import edu.javacourse.register.domain.MarriageCertificate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarriageDao extends JpaRepository<MarriageCertificate, Long>
{
    List<MarriageCertificate> findByNumber(String number);

    List<MarriageCertificate> findByNum(@Param("number") String number);

    @Query("SELECT mc FROM MarriageCertificate mc WHERE mc.number = :number")
    List<MarriageCertificate> findSomething(@Param("number") String number);
}
