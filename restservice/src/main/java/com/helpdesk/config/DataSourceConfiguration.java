/**
 * 
 */
package com.helpdesk.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.helpdesk.dao.ComplaintsDAO;
import com.helpdesk.dao.ComplaintsDAOImpl;
import com.helpdesk.dao.ModulesDAO;
import com.helpdesk.dao.ModulesDAOImpl;
import com.helpdesk.dao.TopicDAOImpl;
import com.helpdesk.dao.TopicsDAO;


/**
 * @author C728472
 *
 */
@Configuration
@ComponentScan(basePackages="com.helpdesk")
@EnableWebMvc
public class DataSourceConfiguration extends WebMvcConfigurerAdapter {
	
	ModulesDAOImpl modulesDAOImpl;
	
	ComplaintsDAOImpl complaintsDAOImpl;
	
	TopicDAOImpl topicDAOImpl;
	
	
	@Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/contactdb");
        dataSource.setUsername("root");
        dataSource.setPassword("P@ssw0rd");
         
        return dataSource;
    }
	
	public ComplaintsDAO getComplaintsDAO(){
		if(complaintsDAOImpl==null){
			complaintsDAOImpl= new ComplaintsDAOImpl(getDataSource());
		}
		return complaintsDAOImpl;
	}
	
	public ModulesDAO getModulesDAO(){
		if(modulesDAOImpl!=null){
			modulesDAOImpl= new ModulesDAOImpl(getDataSource());
		}
		return modulesDAOImpl;
	}
	
	public TopicsDAO getTopicDAO(){
		if(topicDAOImpl==null){
			topicDAOImpl= new TopicDAOImpl(getDataSource());
		}
		return topicDAOImpl;
	}

}
