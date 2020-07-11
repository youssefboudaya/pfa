package tn.esprit.timesheet.services.interfaces;

import javax.ejb.Local;

import tn.esprit.timesheet.entities.User;

@Local
public interface UserServices {
	void create(User user);
}
