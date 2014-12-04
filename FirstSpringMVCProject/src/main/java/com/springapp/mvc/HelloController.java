package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
//@RequestMapping("/xyz")
public class HelloController {






//this method is called first.we can use this object in any requestmappers as we like
    @ModelAttribute
    public void addingCommonObjects(Model model1){
        model1.addAttribute("headerMessage","College of Engineering & Technology,BBSR");

    }




    @RequestMapping(value = "/admissionForm.html",method = RequestMethod.GET)
    public ModelAndView getAdmissionForm(){

        ModelAndView model = new ModelAndView("AdmissionForm");

        return model;
    }
//
//    @RequestMapping(value = "/submitAdmissionForm.html", method = RequestMethod.POST)
//    public ModelAndView submitAdmissionForm (@RequestParam(defaultValue = "asdf" ,value="studentName") String name,@RequestParam("studentHobby") String hobby){
//
//        ModelAndView model = new ModelAndView("AdmissionSuccess");
//        model.addObject("msg","Details submitted by you : name "+name+" , Hobby :"+hobby);
//
//        return model;
//    }
//    @RequestMapping(value = "/submitAdmissionForm.html", method = RequestMethod.POST)
//    public ModelAndView submitAdmissionForm (@RequestParam(defaultValue = "asdf" ,value="studentName") String name,@RequestParam("studentHobby") String hobby){
//
//        Student student =new Student();
//        student.setStudentName(name);
//        student.setStudentHobby(hobby);


    @RequestMapping(value = "/submitAdmissionForm.html", method = RequestMethod.POST)
// use this function if you want to use @ModelAttribute , then we dont have to create addtional student object
    public ModelAndView submitAdmissionForm(@ModelAttribute("student") Student student){
    ModelAndView model = new ModelAndView("AdmissionSuccess");
        model.addObject("student",student);

        return model;
    }






    @RequestMapping("/welcome/{countryName}/{userName}")
    //@PathVariable("userName") String name,@PathVariable("countryName") String country
	public ModelAndView welcome(@PathVariable Map<String,String> pathVars){

        String name = pathVars.get("userName");
        String country= pathVars.get("countryName");

        ModelAndView model = new ModelAndView("HelloPage");// go to HelloPage.jsp
        model.addObject("message","inside welcome method....welcome "+name+country);// create an object named message and assign value "hello world"


        return model;
    }
    @RequestMapping("/hi")
    public ModelAndView hi(){

        ModelAndView model = new ModelAndView("HelloPage");// go to HelloPage.jsp
        model.addObject("message","inside hi method");// create an object named message and assign value "hello world"
        return model;
    }



}