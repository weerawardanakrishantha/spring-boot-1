package com.krishantha.student_course.controller;

import com.krishantha.student_course.entity.Course;
import com.krishantha.student_course.service.CourseService;
import com.krishantha.student_course.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("courses/students")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @Autowired
    private StudentService studentService;
    @PostMapping("/")
    public Course saveCourse(@RequestBody Course course){
        return courseService.saveCourse(course);
    }
    @GetMapping("/")
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }
}
