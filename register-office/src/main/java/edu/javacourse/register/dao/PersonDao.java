package edu.javacourse.register.dao;

import edu.javacourse.register.domain.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class PersonDao
{
    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> findPersons() {
        Query query = entityManager.createNamedQuery("Person.findPersons");
        query.setParameter("personId", 1L);
        return query.getResultList();
    }
}
