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
public class CompanyProfile {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer companyId;
	private String companyName;
	private String industy;
	private String location;
	@OneToOne
	private Users user;
	
	@OneToMany(mappedBy = "companyProfile")
	private List<JobPost> jobPosts;
	
}
