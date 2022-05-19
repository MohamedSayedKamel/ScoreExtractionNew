package com.alrajhi.score.ScoreExtraction.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alrajhi.score.ScoreExtraction.entity.InputBadRecordsLog;

@Repository
public interface InputBadRecordsLogRepository extends JpaRepository<InputBadRecordsLog, Long> {
	
	
	public List<InputBadRecordsLog> findByOrderByLogIdDesc();
	
}

 