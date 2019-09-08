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
}
