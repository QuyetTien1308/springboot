package com.example.employeemanage.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table (name = "job_department")
public class JobDepartment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "job_id")
	private Long jobId;
	
	@Column(name = "job_dept")
	private String jopDept;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "salary_range")
	private Float salaryRange;
	
	@OneToMany(mappedBy = "jobDepartmentId")
	private List<Salary> salaryBonus = new ArrayList<>();

	@OneToMany(mappedBy = "jobDepartmentId")
	private List<Payroll>  payrolls= new ArrayList<>();

}
