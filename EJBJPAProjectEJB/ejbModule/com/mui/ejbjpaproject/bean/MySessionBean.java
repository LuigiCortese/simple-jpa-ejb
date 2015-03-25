package com.mui.ejbjpaproject.bean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.mui.ejppaproject.entity.Employee;

/**
 * Session Bean implementation class MySessionBean
 */
@Stateless
@LocalBean
public class MySessionBean implements MySessionBeanRemote, MySessionBeanLocal {

	// Injected database connection:
	@PersistenceContext
	private EntityManager em;
	
    /**
     * Default constructor. 
     */
    public MySessionBean() {
        // TODO Auto-generated constructor stub
    }
    
    public void persist(Employee e) {
		em.persist(e);
	}

}
