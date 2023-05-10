package com.example.employeemanage.dto;

import lombok.Data;

import java.util.Date;

@Data
public class LeaveDTO {

	private Long leaveId;
	
	private Long employeeId;
	
	private Date date;
	
	private String reason;
	
}
