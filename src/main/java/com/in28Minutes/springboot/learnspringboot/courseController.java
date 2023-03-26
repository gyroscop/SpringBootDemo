package com.in28Minutes.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class courseController {
	
	@RequestMapping("/course")
	public List<Course> retrieveAllCourses(){
		
		return Arrays.asList(
					new Course(1,"Learn AWS","in28Minutes"),
					new Course(1,"Learn DevOps","in28Minutes")
				
				);
	}

}
