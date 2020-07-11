package  tn.esprit.timesheet.services.interfaces;



import java.util.Date;
import java.util.List;

import javax.ejb.Remote;


import tn.esprit.timesheet.entities.*;


@Remote
public interface TimesheetServiceRemote {
	


	 public List < Project > getAllProjects();

	 public void ajouterProject(Project apprenant);
	 public void updateProject(Project apprenant);

	 
	 public void deleteProjectById(int apprenantId);
	 public void affecterUserAProject(int employeId, int depId);
	 public List < Leave_request > getAllLeave_requests();

	 public void ajouterLeave_request(Leave_request apprenant);
	 public void updateLeave_request(Leave_request apprenant);

	 
	 public void deleteLeave_requestById(int apprenantId);

	 public List < Timesheet > getAllTimesheets();

	 public void ajouterTimesheet(Timesheet apprenant);
	 public void updateTimesheet(Timesheet apprenant) ;

	 public void deleteTimesheetById(int apprenantId);
}
