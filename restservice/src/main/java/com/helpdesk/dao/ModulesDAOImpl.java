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

import com.helpdesk.model.Modules;


/**
 * @author Kavichezliyan Rajendran
 *
 */
public class ModulesDAOImpl implements ModulesDAO {

	private JdbcTemplate jdbcTemplate;


	public ModulesDAOImpl(DataSource dataSource){
		jdbcTemplate=new JdbcTemplate(dataSource);	
	}


	public void saveOrUpdate(Modules modules) {
		// TODO Auto-generated method stub
		
	}


	public void delete(int moduleId) {
		// TODO Auto-generated method stub
		
	}


	public Modules get(int moduleId) {
		// TODO Auto-generated method stub
		return null;
	}


	public List<Modules> getList() {
		String sql = " select * from Resume_FeedBack_Modules_Master";
		List<Modules> modulesList = jdbcTemplate.query(sql, new RowMapper<Modules>() {

			public Modules mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
				Modules modules = new Modules();
				modules.setModuleId(resultSet.getString("STR_MODULE_ID"));
				modules.setModuleDetails(resultSet.getString("STR_MODULE_DETAILS"));
				return modules;
			}
		});
				
	return modulesList;
	}

}
