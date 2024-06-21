package com.example.apple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apple.model.JobTitle;
@Repository

public interface JobTitleRepository extends JpaRepository<JobTitle, Integer> {

}