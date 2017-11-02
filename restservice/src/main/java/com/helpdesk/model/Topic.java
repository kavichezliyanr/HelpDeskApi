/**
 * 
 */
package com.helpdesk.model;

/**
 * @author C728472
 *
 */
public class Topic {
	
	private String topicId;
	
	private String topicDetails;
	
	public Topic(){}
	
	public Topic(String topicId, String topicDetails){
		this.topicId=topicId;
		this.topicDetails=topicDetails;
	}

	/**
	 * @return the topicId
	 */
	public String getTopicId() {
		return topicId;
	}

	/**
	 * @param topicId the topicId to set
	 */
	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

	/**
	 * @return the topicDetails
	 */
	public String getTopicDetails() {
		return topicDetails;
	}

	/**
	 * @param topicDetails the topicDetails to set
	 */
	public void setTopicDetails(String topicDetails) {
		this.topicDetails = topicDetails;
	}
}
