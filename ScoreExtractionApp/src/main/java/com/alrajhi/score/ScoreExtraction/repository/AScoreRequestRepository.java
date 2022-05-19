package com.alrajhi.score.ScoreExtraction.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.alrajhi.score.ScoreExtraction.entity.AScoreRequest;

@Repository
public interface  AScoreRequestRepository extends JpaRepository<AScoreRequest, Long> 
{	
	public List<AScoreRequest> findTop10000ByProcessStatusIsNullOrderByRequestIdAsc();
	//public List<AScoreRequest> findTop1ByProcessStatusIsNullOrderByRequestIdAsc();
	
	@Transactional
	@Modifying
	@Query("update AScoreRequest score set score.processStatus = ?1 where score.requestId=?2")
	int setProcessStatusForAScoreRequest(String status,long requestId);
	
		
}
