package com.example.employeemanage.dto;

import lombok.Data;

import java.util.Date;

@Data
public class QualificationDTO {

	private Long qualId;
	
	private Long emp_id;
	
	private String position;
	
	private String requirements;
	
	private Date dateIn;
	
}
