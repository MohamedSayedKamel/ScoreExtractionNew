package com.alrajhi.score.ScoreExtraction.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the BATCH_LOG database table.
 * 
 */
@Entity
@Table(name="BATCH_LOG")
@NamedQuery(name="BatchLog.findAll", query="SELECT b FROM BatchLog b")
public class BatchLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="BATCH_ID")
	private long batchId;

	@Column(name="BATCH_FILE_NAME")
	private String batchFileName;

	@Column(name="BATCH_TIMESTAMP")
	private Timestamp batchTimestamp;

	public BatchLog() {
	}

	public long getBatchId() {
		return this.batchId;
	}

	public void setBatchId(long batchId) {
		this.batchId = batchId;
	}

	public String getBatchFileName() {
		return this.batchFileName;
	}

	public void setBatchFileName(String batchFileName) {
		this.batchFileName = batchFileName;
	}

	public Timestamp getBatchTimestamp() {
		return this.batchTimestamp;
	}

	public void setBatchTimestamp(Timestamp batchTimestamp) {
		this.batchTimestamp = batchTimestamp;
	}

}