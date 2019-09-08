package com.vivo.test;

import com.vivo.po.Person;
import com.vivo.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;


/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class PersonServiceTest {
	 @Resource(name = "personService")
	 private PersonService personService;
	    
	    @Test
	    public void getUserByIdTest(){
	        List<Person> list =  personService.findAll();
	        for (Person person : list) {
	            System.out.println(person);  
	        }  
	    }
}
