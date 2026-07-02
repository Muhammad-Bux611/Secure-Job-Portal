package com.job.model;

import com.job.payload.Role;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
@Entity
@Data
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	private String name;
	private String email;
	private String password;
	@Enumerated(EnumType.STRING)
	private Role role; 
	@OneToOne(mappedBy = "user")
	private CompanyProfile company;
	@OneToOne(mappedBy = "user")
	private CandidateProfile candidateProfile;
}
