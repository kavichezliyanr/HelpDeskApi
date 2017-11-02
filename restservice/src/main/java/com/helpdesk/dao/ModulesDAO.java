/**
 * 
 */
package com.helpdesk.dao;

import java.util.List;

import com.helpdesk.model.Modules;

/**
 * @author C728472
 *
 */
public interface ModulesDAO {
	
	public void saveOrUpdate(Modules modules);
    
    public void delete(int moduleId);
     
    public Modules get(int moduleId);
     
    public List<Modules> getList();

}
