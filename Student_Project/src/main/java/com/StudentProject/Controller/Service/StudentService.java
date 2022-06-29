package com.StudentProject.Controller.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentProject.Model.StudentModel;
import com.StudentProject.Repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	
	StudentRepository studentRepository;

	public void postStudentmodel(StudentModel studentModel) {
		studentRepository.save(studentModel);
		
		
	}

	public void updateStudentModelById(int id, StudentModel studentModel) {
		Optional<StudentModel> studentModel1=studentRepository.findById(id);
		StudentModel StudentModel2=studentModel1.get();
	StudentModel2.setId(studentModel.getId());
	StudentModel2.setName(studentModel.getName());
	StudentModel2.setLoc(studentModel.getLoc());
	studentRepository.save(StudentModel2);
		
	}

	public List<StudentModel> getStudentModel() {
		List<StudentModel> studentModel=(List<StudentModel>)
				studentRepository.findAll();
		return studentModel;
		
	}

	public void deleteStudentModelById(int id) {
		studentRepository.deleteById(id);
		
	}

	



}
