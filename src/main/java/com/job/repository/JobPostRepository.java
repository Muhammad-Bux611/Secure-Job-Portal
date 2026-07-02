package com.job.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.job.model.JobPost;

@Repository
public interface JobPostRepository extends JpaRepository<JobPost, Integer> {

}
