package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;
@Service
public class CourseServiceImp implements CourseService {
	
	List<Course> list;
	
	public CourseServiceImp() {
		list = new ArrayList<>();
		list.add(new Course(145,"Java Course","this is a java course"));
		list.add(new Course(246,"Python Course","this is a python course"));
		list.add(new Course(731,"C++ Course","this is a cpp course"));
		
	}
	
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}


	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		Course c = null;
		for(Course course:list) {
			if(course.getId()== courseId) {
				c = course;
				break;
			}
		}
		return c;
	}
	
	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

}
