package com.job.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class CandidateProfile {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer candidateId;
	private String skills;
	private String experience;
	@OneToOne
	private Users user;
	@OneToMany(mappedBy = "candidateProfile")
	List<JobApplication> applications;
}
