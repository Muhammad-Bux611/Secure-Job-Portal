package com.job.dto;

import java.util.List;

import com.job.model.JobPost;
import com.job.model.Users;
import lombok.Data;

@Data
public class CompanyProfileDTO {

	private Integer companyId;
	private String companyName;
	private String industy;
	private String location;
	private Users user;
	private List<JobPost> jobPosts;
	
}
