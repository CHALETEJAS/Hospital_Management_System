package com.HospitalManagementSytem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name= "patients")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private String name;
	
	@Column(name="age")
	private String age;
	
	@Column(name="blood_group")
	private String blood;
	
	@Column(name="prescription")
	private String prescription;
	
	@Column(name="dose")
	private String dose;
	
	@Column(name="fees")
	private String fees;
	
	@Column(name="urgency")
	private String urgency;
}
