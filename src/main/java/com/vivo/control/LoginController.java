package com.vivo.control;

import com.vivo.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Resource(name = "personService")
    private PersonService personService;

    @GetMapping(value = "login")
    public String login(Integer id, String password, HttpSession session){
        System.out.println(personService.getByid(id));
        if (password.equals(personService.getByid(id).getPassword())){
            session.setAttribute("person",personService.getByid(id));
            return "redirect:person/getAll";
        }
        return  "redirect:login.jsp";
    }

    @RequestMapping("index")
    public  ModelAndView toLogin(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return  modelAndView;
    }
}
