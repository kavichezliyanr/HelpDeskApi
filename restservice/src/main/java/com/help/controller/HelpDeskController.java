/**
 * 
 */
package com.help.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.helpdesk.dao.ComplaintsDAO;
import com.helpdesk.dao.ModulesDAO;
import com.helpdesk.dao.TopicsDAO;
import com.helpdesk.model.Complaints;
import com.helpdesk.model.Modules;
import com.helpdesk.model.Topic;

/**
 * @author C728472
 *
 */
@Controller
public class HelpDeskController {
	
	@Autowired
	private ComplaintsDAO complaintsDAO;
	
	@Autowired
	private TopicsDAO topicsDAO;
	
	@Autowired
	private ModulesDAO modulesDAO;
	
	@RequestMapping(value="/helpdesk/getModules",method=RequestMethod.GET,headers="Accept=application/json")
	public List<Modules> getModules(){
		List<Modules> modules=modulesDAO.getList();
		return modules;
	}
	
	@RequestMapping(value="/helpdesk/getTopic",method=RequestMethod.GET,headers="Accept=application/json")
	public List<Topic> getTopics(){
		List<Topic> topics=topicsDAO.getList();
		return topics;
	}
	
	@RequestMapping(value="helpdesk/complaints",method=RequestMethod.POST,headers="Accept=application/json")
	public Complaints createComplaints(@ModelAttribute Complaints complaints){
		int output = complaintsDAO.saveOrUpdate(complaints);
		return complaints;
	}

	
	
}
