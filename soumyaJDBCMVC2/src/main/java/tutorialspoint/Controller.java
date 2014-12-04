package tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by user on 2014/12/03.
 */


@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    StudentDAO studentDAO;

    @RequestMapping(value="/editContact")
    public ModelAndView editContact(HttpServletRequest request)
    {
        int id = Integer.parseInt(request.getParameter("id"));
        ModelAndView model = new ModelAndView("edit","id",id);
        return model;

    }


    @RequestMapping(value = "/update")
    public ModelAndView update(HttpServletRequest request) {

        String id = request.getParameter("id");
        String age = request.getParameter("age");

        studentDAO.update(Integer.parseInt(id), Integer.parseInt(age));

        return new ModelAndView("redirect:/");

    }



    @RequestMapping(value = "/")
    public ModelAndView listAll(){

        List<Student> list=studentDAO.listStudents();
        return new ModelAndView("home","students",list);
    }

    @RequestMapping(value = "/newContact")
    public ModelAndView newContact(){
        ModelAndView model = new ModelAndView("insert");
        return model;
    }

    @RequestMapping(value="/deleteContact", method = RequestMethod.GET)
    public ModelAndView deleteContact(HttpServletRequest request){

        int id = Integer.parseInt(request.getParameter("id"));
        studentDAO.delete(id);
        return new ModelAndView("redirect:/");

    }




    @RequestMapping(value = "/insert",method = RequestMethod.GET)
    public ModelAndView insert()
    {
        ModelAndView model = new ModelAndView("insert");
        return model;
    }

    @RequestMapping(value = "/success")
    public ModelAndView test(HttpServletRequest request, HttpServletResponse response) {


        String name = request.getParameter("name");
        String age = request.getParameter("age");


//        student.setName(name);
//        student.setAge(Integer.parseInt(age));

//        Student.setId(Integer.parseInt(id));
//        Student.setName(name);
//        Student.setAge(Float.parseFloat(salary));


        studentDAO.create(name, Integer.parseInt(age));

        return new ModelAndView("redirect:/");

    }




}
