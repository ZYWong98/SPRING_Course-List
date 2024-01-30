/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.application.courses;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wongz
 */
public class Courses {
    
    private List<Course> courses;

    public Courses() {
        courses = new ArrayList<>();
    }

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
