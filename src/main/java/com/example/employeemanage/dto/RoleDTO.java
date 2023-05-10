package com.example.employeemanage.dto;

import com.example.employeemanage.model.enums.ERoles;
import lombok.Data;

@Data
public class RoleDTO {
	
	private Long id;
	private ERoles name;
}
