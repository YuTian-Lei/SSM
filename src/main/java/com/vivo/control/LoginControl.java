package com.vivo.control;

import java.util.List;
import com.vivo.po.Person;
import com.vivo.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;


@Controller
public class LoginControl {

    @Resource(name = "personService")
    private PersonService personService;
      
    @RequestMapping("main")  
    public ModelAndView test(){            
        List<Person> list = personService.findAll();
        for (Person person : list) {  
            System.out.println(person);  
        }  
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("list", list);
        return modelAndView;
    }  
}  
