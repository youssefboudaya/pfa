package tn.esprit.timesheet.services.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.timesheet.entities.User;
import tn.esprit.timesheet.services.interfaces.UserServices;
import tn.esprit.timesheet.services.interfaces.UserServicesRemote;

@Stateless
@LocalBean
public class UserImpl implements UserServices, UserServicesRemote {
	@PersistenceContext
	EntityManager em;

	@Override
	public void create(User user) {
		em.persist(user);		
	}
}
