/**
 * 
 */
package com.helpdesk.model;

import java.sql.Date;

/**
 * @author C728472
 *
 */
public class Complaints {
	
	/* Unique ID generated */
	private int requestId;
	
	/* Id of the one who has raised request */
	private String userId;
	
	/* Module for which the request has been raised */
	private String complaintModule;
	
	/* Sub Module for which the request has been generated */
	private String complaintTopic;
	
	/* Content of request */
	private String complaintDetails;
	
	/* Date Of Request */
	private Date requestDate;
	
	/* Status Of request */
	private String requestStatus;
	
	/* Date of Status Change */
	private Date statusChangeDate;
	
	/* Level */
	private String statusLevel;
	
	/* Severity Of Request */
	private String statusSeverity;
	
	/* capture old request call no, if call is open again */
	private int oldRequestId;
	
	/* catupring cross call type */
	private String crossCallType;
	
	/* Type of call */
	private String callType;
		
	public Complaints(){
		
	}
	
	public Complaints(String userId, String complaintModule, String complaintTopic, String complaintDetails){
		this.userId = userId;
		this.complaintModule=complaintModule;
		this.complaintTopic=complaintTopic;
		this.complaintDetails=complaintDetails;
	}

	/**
	 * @return the requestId
	 */
	public int getRequestId() {
		return requestId;
	}

	/**
	 * @param requestId the requestId to set
	 */
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the complaintModule
	 */
	public String getComplaintModule() {
		return complaintModule;
	}

	/**
	 * @param complaintModule the complaintModule to set
	 */
	public void setComplaintModule(String complaintModule) {
		this.complaintModule = complaintModule;
	}

	/**
	 * @return the complaintTopic
	 */
	public String getComplaintTopic() {
		return complaintTopic;
	}

	/**
	 * @param complaintTopic the complaintTopic to set
	 */
	public void setComplaintTopic(String complaintTopic) {
		this.complaintTopic = complaintTopic;
	}

	/**
	 * @return the complaintDetails
	 */
	public String getComplaintDetails() {
		return complaintDetails;
	}

	/**
	 * @param complaintDetails the complaintDetails to set
	 */
	public void setComplaintDetails(String complaintDetails) {
		this.complaintDetails = complaintDetails;
	}

	/**
	 * @return the requestDate
	 */
	public Date getRequestDate() {
		return requestDate;
	}

	/**
	 * @param requestDate the requestDate to set
	 */
	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	/**
	 * @return the requestStatus
	 */
	public String getRequestStatus() {
		return requestStatus;
	}

	/**
	 * @param requestStatus the requestStatus to set
	 */
	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}

	/**
	 * @return the statusChangeDate
	 */
	public Date getStatusChangeDate() {
		return statusChangeDate;
	}

	/**
	 * @param statusChangeDate the statusChangeDate to set
	 */
	public void setStatusChangeDate(Date statusChangeDate) {
		this.statusChangeDate = statusChangeDate;
	}

	/**
	 * @return the statusLevel
	 */
	public String getStatusLevel() {
		return statusLevel;
	}

	/**
	 * @param statusLevel the statusLevel to set
	 */
	public void setStatusLevel(String statusLevel) {
		this.statusLevel = statusLevel;
	}


	/**
	 * @return the oldRequestId
	 */
	public int getOldRequestId() {
		return oldRequestId;
	}

	/**
	 * @param oldRequestId the oldRequestId to set
	 */
	public void setOldRequestId(int oldRequestId) {
		this.oldRequestId = oldRequestId;
	}

	/**
	 * @return the crossCallType
	 */
	public String getCrossCallType() {
		return crossCallType;
	}

	/**
	 * @param crossCallType the crossCallType to set
	 */
	public void setCrossCallType(String crossCallType) {
		this.crossCallType = crossCallType;
	}

	/**
	 * @return the callType
	 */
	public String getCallType() {
		return callType;
	}

	/**
	 * @param callType the callType to set
	 */
	public void setCallType(String callType) {
		this.callType = callType;
	}

	/**
	 * @return the statusSeverity
	 */
	public String getStatusSeverity() {
		return statusSeverity;
	}

	/**
	 * @param statusSeverity the statusSeverity to set
	 */
	public void setStatusSeverity(String statusSeverity) {
		this.statusSeverity = statusSeverity;
	}

}
