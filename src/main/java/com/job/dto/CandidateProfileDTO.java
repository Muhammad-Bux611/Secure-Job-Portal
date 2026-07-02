package com.job.dto;

import java.util.List;

import com.job.model.JobApplication;
import com.job.model.Users;
import lombok.Data;

@Data
public class CandidateProfileDTO {

	private Integer candidateId;
	private String skills;
	private String experience;
	private Users user;
	List<JobApplication> applications;
}
