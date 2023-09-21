package com.training.courseservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.courseservice.intercomm.StudentClient;
import com.training.courseservice.model.Course;
import com.training.courseservice.model.Student;
import com.training.courseservice.repository.CourseRepository;

@RestController
@RequestMapping("/courseapi")
public class CourseController {
	
		@Autowired
		CourseRepository repository;
		@Autowired
		StudentClient studClient;

		@GetMapping("/get")
//		public List<Course> getStud(){
//			return repository.findAll();
//		}
		public ResponseEntity<List<Course>> getCourses(){
			List<Course> courseList=repository.findAll();
			return new ResponseEntity<>(courseList, HttpStatus.OK);
		}
		
		@GetMapping("/service/stud/{studId}")
		public Student getStud(@PathVariable int studId) {
			return studClient.getStudent(studId);
		}
		
		@PostMapping("/post")
//		public void post(@RequestBody List<Course> course) {
//			repository.saveAll(course);
//		}
		public ResponseEntity<List<Course>> addCourse(@RequestBody Course course){
			return new ResponseEntity(repository.save(course), HttpStatus.OK);
		}
		
		
		@DeleteMapping("/delete/{id}")
		public void deleteEmployee(@PathVariable("id") String id) {
		      repository.deleteById(id);
		      
		      
		      //ResonseEntity: is a class which returns the http status code along with
		}
}
