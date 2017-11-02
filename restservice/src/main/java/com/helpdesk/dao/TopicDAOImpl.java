/**
 * 
 */
package com.helpdesk.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.helpdesk.model.Topic;

/**
 * @author C728472
 *
 */
public class TopicDAOImpl implements TopicsDAO{
	
	private JdbcTemplate jdbcTemplate;
	
	public TopicDAOImpl(DataSource dataSource){
		jdbcTemplate=new JdbcTemplate(dataSource);
	}

	public void saveOrUpdate(Topic topic) {
		// TODO Auto-generated method stub
		
	}

	public void delete(int topicId) {
		// TODO Auto-generated method stub
		
	}

	public Topic get(int topicId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Topic> getList() {
		String sql = "select * from Resume_Feedback_Topics_Master";
		List<Topic> topics = jdbcTemplate.query(sql, new RowMapper<Topic>(){

			public Topic mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
				Topic topic= new Topic();
				topic.setTopicId(resultSet.getString("STR_MODULE_ID"));
				topic.setTopicDetails(resultSet.getString("STR_MODULE_DETAILS"));
				return topic;
			}});
		
		return topics;
	}

}
