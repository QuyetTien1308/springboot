package com.example.employeemanage.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table (name = "qualification")
public class Qualification {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "qual_id")
	private Long qualId;
	
	@ManyToOne
	@JoinColumn(name = "emp_id")
	private Employee employeeId;
	
	@Column(name = "position")
	private String position;
	
	@Column(name = "requirements")
	private String requirements;
	
	@Column(name = "date_in")
	private Date dateIn;

}
