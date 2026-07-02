package com.job.model;

import java.util.List;

import com.job.payload.JobStatus;
import com.job.payload.JobType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class JobPost {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer postId;
	private String title;
	private String description;
	@Enumerated(EnumType.STRING)
	private JobStatus jobStatus;
	@Enumerated(EnumType.STRING)
	private JobType jobType;
	@ManyToOne
	private CompanyProfile companyProfile;
	@OneToMany(mappedBy = "jobPost")
	List<JobApplication> applications;
}
