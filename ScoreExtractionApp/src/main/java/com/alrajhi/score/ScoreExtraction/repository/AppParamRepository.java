package com.alrajhi.score.ScoreExtraction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alrajhi.score.ScoreExtraction.entity.AppParam;

@Repository
public interface AppParamRepository extends JpaRepository<AppParam, Long> {
	public AppParam findByParamCode(String paramCode);
}