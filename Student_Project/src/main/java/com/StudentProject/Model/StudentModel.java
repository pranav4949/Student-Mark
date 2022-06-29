package com.StudentProject.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentModel {
	
	@Id
	private int id;
	private String name;
	private String loc;

}
