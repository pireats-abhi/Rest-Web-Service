package org.ajgroup.boot.controller;

import java.util.List;
import java.util.Optional;

import org.ajgroup.boot.entity.Student;
import org.ajgroup.boot.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@Autowired
	StudentRepo stRepo;
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		return stRepo.findAll();
	}
	
	@GetMapping("/student/{id}")
	public Optional<Student> getStudent(@PathVariable("id") int id){
		return stRepo.findById(id);
	}
	
	@PostMapping("/student")
	public Student postStudent(@RequestBody Student student) {
		stRepo.save(student);
		return student;
	}
	
	@DeleteMapping("/student/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		Student s = stRepo.getOne(id);
		stRepo.delete(s);
		return "Data has deleted.";
	}
	
	@PutMapping("/student")
	public Student putStudent(@RequestBody Student student) {
		stRepo.save(student);
		return student;
	}

}
