package com.example.employeemanage.dto;

import lombok.Data;

import java.util.Date;

@Data
public class EmployeeDTO {

	private Long empId;
	
	private String fname;
	
	private String lname;
	
	private Boolean gender;
	
	private Date age;
	
	private String contactAdd;
	
	private String empEmail;	

}
