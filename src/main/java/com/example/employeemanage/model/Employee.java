package com.example.employeemanage.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table (name = "employee")
public class Employee {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private Long empId;
	
	@Column(name = "fname")
	private String fname;
	
	@Column(name = "lname")
	private String lname;
	
	@Column(name = "gender")
	private Boolean gender;
	
	@Column(name = "age")
	private Date age;
	
	@Column(name = "contact_add")
	private String contactAdd;
	
	@Column(name = "emp_email")
	private String empEmail;
	
	@Column(name = "emp_pass")
	private String empPass;
	
	@OneToMany(mappedBy = "employeeId")
	private List<Leave> leaves = new ArrayList<>();

	@OneToMany(mappedBy = "employeeId")
	private List<Qualification>  qualifications = new ArrayList<>();
	
	@OneToMany(mappedBy = "employeeId")
	private List<Payroll> payrolls = new ArrayList<>();
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "employee_roles", 
		joinColumns = @JoinColumn(name = "emp_id"), 
		inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles;
	
	

}
