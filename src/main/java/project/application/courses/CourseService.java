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
    private int curId=0;
    private final List<Course> courses = new ArrayList<>();
    
    public List<Course> getAll(){
        return courses;
    }
    
    public Course get(int id){
        return courses.get(courses.indexOf(new Course(id)));
    }
    
    public void add(Course course){
        courses.add(new Course(curId++, 
                //course.getNumber(), 
                course.getSubject(), 
                course.getTitle(), 
                course.getCredits(), 
                course.isOffered(), 
                course.getDescription()));
    }
    
    public void update(Course course){
        courses.set(courses.indexOf(course), course);
    }
}
