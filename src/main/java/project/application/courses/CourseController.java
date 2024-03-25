/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.application.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author wongz
 */
@Controller
public class CourseController {
    
    @Autowired
    private CourseService service;

    //Retrieve all rows added in service
    @RequestMapping("/courses")
    public String all(Model model){
        model.addAttribute("courses", service.getAll());
        return "courses";
    }
    
    //Redirect to Add Form
    @GetMapping("/courses/add")
    public String addForm(Model model){
        return "add";
    }
    
    //Add new row after inputting values
    @PostMapping("/courses/add")
    public String add(@RequestParam String subject, @RequestParam String title, @RequestParam int credits, @RequestParam(defaultValue = "false") boolean offered, @RequestParam String description, Model model){
        service.add(new Course(subject, title, credits, offered, description));
        return "redirect:/courses";
    }
    
    //Redirect to details page
    @GetMapping("/courses/{id}/view")
    public String viewForm(@PathVariable int id, Model model){
        model.addAttribute("course", service.get(id)); //send attributes of Course object to model
        return "details";
    }

    //Redirect to update page
    @GetMapping("/courses/{id}/update")
    public String updateForm(@PathVariable int id, Model model){
        model.addAttribute("course", service.get(id)); //send attributes of Course object to model
        return "update";
    }
    
    //Update row details
    @PostMapping("/courses/{id}/update")
    public String update(@ModelAttribute Course course){
        service.update(course);
        return "redirect:/courses";
    }
}
