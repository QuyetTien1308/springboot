package com.example.employeemanage.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table (name = "salary")
public class Salary {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "salary_id")
	private Long salaryId;
	
	@ManyToOne
	@JoinColumn(name = "job_id")
	private JobDepartment jobDepartmentId;
	
	@Column(name = "amount")
	private Integer amount;
	
	@Column(name = "anual")
	private Integer anual;
	
	@Column(name = "bonus")
	private Double bonus;
	
	@OneToMany(mappedBy = "salaryBonusId")
	private List<Payroll> payrolls = new ArrayList<>();

}
