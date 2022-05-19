package com.alrajhi.score.ScoreExtraction.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alrajhi.score.ScoreExtraction.entity.BScoreResponse;

@Repository
public interface BScoreResponseRepository extends JpaRepository<BScoreResponse, Long> {
}
