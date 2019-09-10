package com.vivo.service;

import com.vivo.po.Person;
import com.vivo.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("personService")
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    public List<Person> findAll() {
        return personDao.findall();
    }

    public  void addPerson(Person person){
         personDao.addPerson(person);
    }

    public void  deletePerson(Integer id){
        personDao.deletePerson(id);
    }

    public Person getByid(Integer id){
        return  personDao.getByid(id);
    }

    public void updatePerson(Person person){
        personDao.updatePerson(person);
    }

}
