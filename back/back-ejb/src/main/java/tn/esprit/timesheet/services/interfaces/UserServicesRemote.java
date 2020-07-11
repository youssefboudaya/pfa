package tn.esprit.timesheet.services.interfaces;

import javax.ejb.Remote;

import tn.esprit.timesheet.entities.User;

@Remote
public interface UserServicesRemote {
	void create(User user);
}
