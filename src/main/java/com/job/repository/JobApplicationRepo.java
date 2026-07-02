package com.job.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.job.model.JobApplication;

@Repository
public interface JobApplicationRepo extends JpaRepository<JobApplication, Integer> {

}
