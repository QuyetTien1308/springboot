package com.example.employeemanage.dto;

import lombok.Data;

@Data
public class SalaryBonusDTO {

	private Long salaryId;
	
	private Long job_id;
	
	private Double amount;
	
	private String anual;
	
	private Double bonus;
	
}
