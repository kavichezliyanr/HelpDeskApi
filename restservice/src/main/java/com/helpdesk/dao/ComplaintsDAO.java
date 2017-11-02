/**
 * 
 */
package com.helpdesk.dao;

import com.helpdesk.model.Complaints;

/**
 * @author C728472
 *
 */
public interface ComplaintsDAO {
	
	public int saveOrUpdate(Complaints complaints);

}
