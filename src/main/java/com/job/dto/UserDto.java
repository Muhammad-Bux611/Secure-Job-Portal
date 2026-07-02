package com.job.dto;

import com.job.model.CandidateProfile;
import com.job.model.CompanyProfile;
import com.job.payload.Role;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
@Data
public class UserDto {

	private Integer userId;
	private String name;
	private String email;
	private String password;
	@Enumerated(EnumType.STRING)
	private Role role; 
	private CompanyProfile company;
	private CandidateProfile candidateProfile;
}
