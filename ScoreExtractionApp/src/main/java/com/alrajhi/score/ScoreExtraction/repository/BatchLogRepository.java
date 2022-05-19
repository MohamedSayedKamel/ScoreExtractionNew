package com.alrajhi.score.ScoreExtraction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alrajhi.score.ScoreExtraction.entity.BatchLog;

@Repository
public interface BatchLogRepository extends JpaRepository<BatchLog, Long> {

}