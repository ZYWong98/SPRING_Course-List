/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.application.courses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import lombok.NoArgsConstructor;

/**
 *
 * @author wongz
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    
    private int id;
    //private String number;
    private String subject;
    private String title;
    private int credits;
    private boolean offered;
    private String description;

    public Course(int id) {
        this.id=id;
    }

    public Course(String subject, String title, int credits, boolean offered, String description) {
        
        //this.number = number;
        this.subject = subject;
        this.title = title;
        this.credits = credits;
        this.offered = offered;
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + this.id;
        return hash;
    }
    
    @Override
    public boolean equals(Object o){
        if (o == null) return false;
        if (!(o instanceof Course)) return false;
        return id == ((Course)o).id;
    }
    
    @Override
    public String toString(){
        return String.format("Course[id=%d, subject=%s, title=%s, credits=%d, offered=%b, description=%s]",
                id, subject,title, credits, offered, description);
    }
}
