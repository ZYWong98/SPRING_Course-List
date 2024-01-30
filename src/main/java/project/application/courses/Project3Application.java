package project.application.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Project3Application implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(Project3Application.class, args);
    }

    @Autowired
    private CourseService service;

    @Override
    public void run(String... args) throws Exception {
        service.add(new Course("ICS", "Programming", 0, true, "Example"));
        service.add(new Course("ICS", "Coding", 3, false, "Example 2"));
    }
}
