package com.example.SpJPARunner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpJPARunner.Model.Student1;
import com.example.SpJPARunner.repo.StudentRepo;
import com.example.SpJPARunner.service.StudentService;

@RestController
public class StudentController {
@Autowired
StudentService service;

	
@PostMapping("/savestudent")
	public Student1  SaveStudentDetails(@RequestBody Student1 st)
	{
	try {
		service.saveStudent(st);
		
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return st;
	}

@GetMapping("/getDetails/{id}")
public Student1 getStudent(@PathVariable Long id)
{
	return service.getStudentDetails(id);
}


@GetMapping("/getAllNamesContaining/{name}")

public List<Student1> getAllStudent(@PathVariable String name)
{
	return service.getAllStudents(name);
}

@GetMapping("/getAllpercentageContaining/{percent}")

public List<Student1> getAllStudent1(@PathVariable int percent)
{
	return service.getAllStudentspercent(percent);
}

@GetMapping("/findnameandcollege/{name}/{college}")
	public Student1 findStudent(@PathVariable String name,@PathVariable String college)
	{
		return service.findNameAndCollege(name,college);
	}

@PutMapping("/updatePercentOnName/{percent}/{name}")
public String  findStudent3(@PathVariable int percent,@PathVariable String name)
{
	return service.updatePerBasedOnName(percent,name);
}
}
