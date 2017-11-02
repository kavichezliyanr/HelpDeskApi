/**
 * 
 */
package com.helpdesk.model;

/**
 * @author C728472
 *
 */
public class Modules {
	
	private String moduleId;
	
	private String moduleDetails;
	
	public Modules(){
		
	}
	
	public Modules(String moduleId, String moduleDetails){
		this.moduleId = moduleId;
		this.moduleDetails=moduleDetails;
	}

	/**
	 * @return the moduleId
	 */
	public String getModuleId() {
		return moduleId;
	}

	/**
	 * @param moduleId the moduleId to set
	 */
	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	/**
	 * @return the moduleDetails
	 */
	public String getModuleDetails() {
		return moduleDetails;
	}

	/**
	 * @param moduleDetails the moduleDetails to set
	 */
	public void setModuleDetails(String moduleDetails) {
		this.moduleDetails = moduleDetails;
	}

}
