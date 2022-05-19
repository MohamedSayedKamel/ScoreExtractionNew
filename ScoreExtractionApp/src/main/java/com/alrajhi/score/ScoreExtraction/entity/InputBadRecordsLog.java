package com.alrajhi.score.ScoreExtraction.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the INPUT_BAD_RECORDS_LOG database table.
 * 
 */
@Entity
@Table(name="INPUT_BAD_RECORDS_LOG")
@NamedQuery(name="InputBadRecordsLog.findAll", query="SELECT i FROM InputBadRecordsLog i")
public class InputBadRecordsLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LOG_DATE")
	private Date logDate;

	@Column(name="FILE_NAME")
	private String fileName;

	@Column(name="LOG_ID")
	private BigDecimal logId;

	@Column(name="LOG_MSG")
	private String logMsg;

	@Column(name="LOG_TYPE")
	private String logType;

	public InputBadRecordsLog() {
	}

	public Date getLogDate() {
		return this.logDate;
	}

	public void setLogDate(Date logDate) {
		this.logDate = logDate;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public BigDecimal getLogId() {
		return this.logId;
	}

	public void setLogId(BigDecimal logId) {
		this.logId = logId;
	}

	public String getLogMsg() {
		return this.logMsg;
	}

	public void setLogMsg(String logMsg) {
		this.logMsg = logMsg;
	}

	public String getLogType() {
		return this.logType;
	}

	public void setLogType(String logType) {
		this.logType = logType;
	}

}