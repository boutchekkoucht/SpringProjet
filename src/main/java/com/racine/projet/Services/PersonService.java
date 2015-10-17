package com.racine.projet.Services;

import com.racine.projet.Dao.IPersonDao;
import com.racine.projet.entities.Person;

import java.util.List;

/**
 * Created by ADMiN on 17/10/2015.
 */
public class PersonService implements IPersonService{

    private IPersonDao dao;

    public IPersonDao getDao() {
        return dao;
    }

    public void setDao(IPersonDao dao) {
        this.dao = dao;
    }

    @Override
    public void addPerson(Person person) {
        dao.addPerson(person);
    }

    @Override
    public List<Person> getAll() {
        return dao.getAll();
    }
}
