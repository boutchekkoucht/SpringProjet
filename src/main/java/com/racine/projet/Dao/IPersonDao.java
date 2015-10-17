package com.racine.projet.Dao;

import com.racine.projet.entities.Person;

import java.util.List;

/**
 * Created by ADMiN on 17/10/2015.
 */
public interface IPersonDao {


    public   void  addPerson(Person person);
    public List<Person>  getAll();


}
