package com.vivo.dao;
import com.vivo.po.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonDao {
   public  List<Person> findall();
}  
