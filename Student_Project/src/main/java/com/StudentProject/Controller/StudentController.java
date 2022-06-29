package com.StudentProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.StudentProject.Controller.Service.StudentService;
import com.StudentProject.Model.StudentModel;
@RestController
public class StudentController {
	@Autowired
	StudentService studentService;
	
	
	
	@PostMapping("/save")
	private String postStudentModel(@RequestBody StudentModel studentModel)
	{
		studentService.postStudentmodel(studentModel);
		return "Data sucesfully posted";
	}
	
	
	@PutMapping("/save/{id}")
	private String updateStudentmodelById(@PathVariable int id,@RequestBody StudentModel studentModel)
	{
		studentService.updateStudentModelById(id,studentModel);
		return "Data sucesfully updated";
		
	}
	@GetMapping("/save")
	
	private List <StudentModel >getStudentModel(){
		List <StudentModel> studentModel=studentService.getStudentModel();
		return (List<StudentModel>)studentModel;
	}
	
	
	@DeleteMapping("/save/{id}")
	private String deleteStudentModelById(@PathVariable int id) {
		studentService.deleteStudentModelById(id);
		return "Data sucesfully deleted";
		
	}

}
