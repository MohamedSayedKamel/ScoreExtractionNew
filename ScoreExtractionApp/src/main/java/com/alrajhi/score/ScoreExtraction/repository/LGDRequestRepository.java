package com.alrajhi.score.ScoreExtraction.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.alrajhi.score.ScoreExtraction.entity.LGDRequest;

@Repository
public interface LGDRequestRepository extends JpaRepository<LGDRequest,Long> {
	public List<LGDRequest> findTop10000ByProcessStatusIsNullOrderByRequestIdAsc();
	
	@Transactional
	@Modifying
	@Query("update LGDRequest lgd set lgd.processStatus = ?1 where lgd.requestId=?2")
	int setProcessStatusForLGDRequest(String status,long requestId);

}
