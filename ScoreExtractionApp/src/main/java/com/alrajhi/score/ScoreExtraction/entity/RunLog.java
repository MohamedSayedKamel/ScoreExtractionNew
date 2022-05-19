package com.alrajhi.score.ScoreExtraction.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the RUN_LOG database table.
 * 
 */
@Entity
@Table(name="RUN_LOG")
@NamedQuery(name="RunLog.findAll", query="SELECT r FROM RunLog r")
public class RunLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="RUN_LOG_LOGID_GENERATOR", sequenceName="LOGGING_SEQUENCE", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RUN_LOG_LOGID_GENERATOR")
	@Column(name="LOG_ID")
	private long logId;

	@Temporal(TemporalType.DATE)
	@Column(name="LOG_DATE")
	private Date logDate;

	@Column(name="LOG_LEVEL")
	private String logLevel;

	@Column(name="LOG_RESULT")
	private String logResult;

	@Column(name="LOG_TYPE")
	private String logType;

	@Column(name="LOG_USER")
	private String logUser;

	@Column(name="REQUEST_ID")
	private BigDecimal requestId;

	@Column(name="RUN_STATUS")
	private String runStatus;

	public RunLog() {
	}

	public long getLogId() {
		return this.logId;
	}

	public void setLogId(long logId) {
		this.logId = logId;
	}

	public Date getLogDate() {
		return this.logDate;
	}

	public void setLogDate(Date logDate) {
		this.logDate = logDate;
	}

	public String getLogLevel() {
		return this.logLevel;
	}

	public void setLogLevel(String logLevel) {
		this.logLevel = logLevel;
	}

	public String getLogResult() {
		return this.logResult;
	}

	public void setLogResult(String logResult) {
		this.logResult = logResult;
	}

	public String getLogType() {
		return this.logType;
	}

	public void setLogType(String logType) {
		this.logType = logType;
	}

	public String getLogUser() {
		return this.logUser;
	}

	public void setLogUser(String logUser) {
		this.logUser = logUser;
	}

	public BigDecimal getRequestId() {
		return this.requestId;
	}

	public void setRequestId(BigDecimal requestId) {
		this.requestId = requestId;
	}

	public String getRunStatus() {
		return this.runStatus;
	}

	public void setRunStatus(String runStatus) {
		this.runStatus = runStatus;
	}

}