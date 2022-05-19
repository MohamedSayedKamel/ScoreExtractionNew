package com.alrajhi.score.ScoreExtraction.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.alrajhi.score.ScoreExtraction.entity.AScoreResponse;

@Repository
public interface AScoreResponseRepository extends JpaRepository<AScoreResponse, Long> {
	public List<AScoreResponse> findTop1ByRunIdIsNotNullOrderByResponseIdAsc();
	
	@Query("SELECT max(ch.responseId) FROM AScoreResponse ch")
	public long getMaxId();
}

