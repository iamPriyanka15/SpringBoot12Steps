package com.priyanka.springboot.learn_spring_boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retriveAllCourses(){
        return Arrays.asList(
                new Course(1,"learn AWS", "UDEMY"),
                new Course(2,"Devops", "in28Minutes"),
                new Course(3,"Azure","Udemy"),
                new Course(4,"GCP","Udemy"),
                new Course(5,"Microservices","Udemy"),
                new Course(3,"pi","u")



        );
    }
}
