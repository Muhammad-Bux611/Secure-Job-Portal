package com.job.model;

import com.job.payload.ApplicationStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class JobApplication {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer applicationId;
	@ManyToOne
	private CandidateProfile candidateProfile;
	@ManyToOne
	private JobPost jobPost;
	@Enumerated(EnumType.STRING)
	private ApplicationStatus applicationStatus;
}
