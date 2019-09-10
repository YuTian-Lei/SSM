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
	    public void findallTest(){
	        //查询全部用户
			List<Person> list =  personService.findAll();
			for (Person person1 : list) {
				System.out.println(person1);
			}
	    }

	    @Test
	    public void addTest(){
			Person person = new Person();
			person.setName("雷鹏飞");
			person.setPassword("66666");

			//增加用户
			personService.addPerson(person);
		}

		@Test
		public void selectTest(){
	    	//查询用户
			Person person = personService.getByid(4);
			System.out.println(person);
	    }
		@Test
		public void updateTest(){
	    	Person person = personService.getByid(4);
			//修改用户
			person.setName("冯晨菁");
			personService.updatePerson(person);
		}

		@Test
	    public  void deleteTest(){
			//删除用户
			personService.deletePerson(4);
		}

}
