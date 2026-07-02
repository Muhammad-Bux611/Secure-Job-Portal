package com.job.dto;

import java.util.List;

import com.job.model.CompanyProfile;
import com.job.model.JobApplication;
import com.job.payload.JobStatus;
import com.job.payload.JobType;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
@Data
public class JobPostDto {

	private Integer postId;
	private String title;
	private String description;
	@Enumerated(EnumType.STRING)
	private JobStatus jobStatus;
	@Enumerated(EnumType.STRING)
	private JobType jobType;
	private CompanyProfile companyProfile;
	List<JobApplication> applications;
}
