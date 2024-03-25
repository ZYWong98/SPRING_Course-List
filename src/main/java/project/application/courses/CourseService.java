/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.application.courses;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author wongz
 */
@Service
public class CourseService {
    //Initialize rolling ID counter
    private int curId=0;
    private final List<Course> courses = new ArrayList<>();
    
    //Get all rows function
    public List<Course> getAll(){
        return courses;
    }
    
    //Get details of one row function
    public Course get(int id){
        return courses.get(courses.indexOf(new Course(id)));
    }
    
    //Add new row function
    public void add(Course course){
        courses.add(new Course(curId++, 
                //course.getNumber(), 
                course.getSubject(), 
                course.getTitle(), 
                course.getCredits(), 
                course.isOffered(), 
                course.getDescription()));
    }
    
    ///Update row function
    public void update(Course course){
        courses.set(courses.indexOf(course), course);
    }
}
