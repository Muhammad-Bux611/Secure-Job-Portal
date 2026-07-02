package com.job.dto;

import com.job.model.CandidateProfile;
import com.job.model.JobPost;
import com.job.payload.ApplicationStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
public class JobApplicationDTO {
	private Integer applicationId;
	private CandidateProfile candidateProfile;
	private JobPost jobPost;
	@Enumerated(EnumType.STRING)
	private ApplicationStatus applicationStatus;
}
