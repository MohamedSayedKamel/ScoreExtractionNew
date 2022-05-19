package com.alrajhi.score.ScoreExtraction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alrajhi.score.ScoreExtraction.entity.RunLog;

@Repository
public interface RunLogRepository extends JpaRepository<RunLog, Long> {
}
