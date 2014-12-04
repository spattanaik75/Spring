package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by user on 2014/12/03.
 */

@Controller
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ModelAndView getAdmissionForm(){

        ModelAndView model = new ModelAndView("login");

        return model;
    }

    @RequestMapping("/hello")
    public ModelAndView helloWorld(HttpServletRequest request,HttpServletResponse response){


        String name = request.getParameter("name");
        String password = request.getParameter("password");

        if (password.equals("admin")){
            String message = "Hello "+ name;
            return new ModelAndView("loginSuccess","message",message);

        }else {

            return new ModelAndView("errorpage","message","Sorry, username and password mismatch.Please try Again.");
        }

    }
}
