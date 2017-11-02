/**
 * 
 */
package com.helpdesk.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.helpdesk.model.Complaints;

/**
 * @author C728472
 *
 */
public class ComplaintsDAOImpl implements ComplaintsDAO{

	private JdbcTemplate jdbcTemplate;
	
	
	public ComplaintsDAOImpl(DataSource dataSource){
		jdbcTemplate=new JdbcTemplate(dataSource);	
	}

	public int saveOrUpdate(Complaints complaints) {
		String sql="insert into HelpDesk_Calls_Master ( STR_REQUEST_TOPIC , STR_USER_ID, DT_REQUEST_DATE , STR_REQUEST_DETAILS,STR_REQUEST_STATUS)"+" values (?,?,?,?,?) ";
		return jdbcTemplate.update(sql,complaints.getComplaintTopic(),complaints.getUserId(),complaints.getRequestDate(),complaints.getComplaintDetails(),complaints.getRequestStatus());
	}
}
