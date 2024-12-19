package com.krishantha.student_course.service;

import com.krishantha.student_course.entity.Course;
import com.krishantha.student_course.repository.CourseRepository;
import com.krishantha.student_course.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private StudentRepository studentRepository;

    public Course saveCourse(Course course){
        return courseRepository.save(course);
    }

    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }
}
