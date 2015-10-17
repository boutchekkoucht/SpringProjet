package com.racine.projet.Dao;

import com.racine.projet.entities.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by ADMiN on 17/10/2015.
 */
public class PersonDao  implements  IPersonDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    public void addPerson(Person person) {

        em.persist(person);
    }

    @Override
    public List<Person> getAll() {
        return  em.createQuery("select  p from  Person  p").getResultList();
    }
}
