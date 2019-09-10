package com.vivo.dao;
import com.vivo.po.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonDao {
   public  void    addPerson(Person person);
   public  void    deletePerson(Integer id);
   public void updatePerson(Person person);
   public  Person  getByid(Integer id);
   public  List<Person> findall();
}
