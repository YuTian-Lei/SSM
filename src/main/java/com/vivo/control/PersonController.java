package com.vivo.control;

import java.util.List;
import com.vivo.po.Person;
import com.vivo.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import javax.annotation.Resource;


@Controller
@RequestMapping("person")
public class PersonController {

    @Resource(name = "personService")
    private PersonService personService;

    @PostMapping(value = "/add")
    public  String addPerson(Person person){
        personService.addPerson(person);
        return "redirect:getAll";
    }

    @DeleteMapping(value = "/delete/{id}")
    public  String delete(@PathVariable(value = "id") Integer id){
        personService.deletePerson(id);
        return "redirect:../getAll";
    }

    @PutMapping(value = "/update")
    public  String update(Person person){
        personService.updatePerson(person);
        return "redirect:getAll";
    }

    @GetMapping(value = "/getById/{id}")
    public  ModelAndView getByid(@PathVariable(value = "id")Integer id){
        Person person = personService.getByid(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("person",person);
        modelAndView.setViewName("person/edit");
        return  modelAndView;
    }

    @GetMapping(value = "/getAll")
    public ModelAndView getAll(){
        List<Person> list = personService.findAll();
        for (Person person : list) {
            // System.out.println(person);
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("persons", list);
        modelAndView.setViewName("person/list");
        return modelAndView;
    }
}  
