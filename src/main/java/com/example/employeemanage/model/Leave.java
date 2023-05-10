package com.example.employeemanage.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "emp_leave")
public class Leave {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "leave_id")
	private Long leaveId;
	
	@ManyToOne
	@JoinColumn(name = "emp_id")
	private Employee employeeId;
	
	@Column(name = "date")
	private Date date;
	
	@Column(name = "reason")
	private String reason;
	
	@OneToMany(mappedBy = "leaveId")
	private List<Payroll> payrolls;

}
