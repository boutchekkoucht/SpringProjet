package com.racine.projet.Services;

import com.racine.projet.Dao.IPersonDao;
import com.racine.projet.entities.Person;

import java.util.List;

/**
 * Created by ADMiN on 17/10/2015.
 */
public interface IPersonService {

   public void addPerson(Person person);

    public List<Person>  getAll();

}
