package com.alrajhi.score.ScoreExtraction.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.alrajhi.score.ScoreExtraction.entity.BScoreRequest;

@Repository
public interface  BScoreRequestRepository extends JpaRepository<BScoreRequest, Long> 
{
	
	public List<BScoreRequest> findTop10000ByProcessStatusIsNullOrderByRequestIdAsc();
	
	@Transactional
	@Modifying
	@Query("update BScoreRequest score set score.processStatus = ?1 where score.requestId=?2")
	int setProcessStatusForBScoreRequest(String status, long requestId);
		
}
