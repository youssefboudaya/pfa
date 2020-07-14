package pidev;


import java.util.List;

import javax.ejb.Remote;


import entities.*;


@Remote
public interface TimesheetServiceRemote {
	


	  List < Project > getAllProjects();

	  void ajouterProject(Project apprenant);
	  void updateProject(Project apprenant);

	 
	  void deleteProjectById(int apprenantId);
	   void affecterUserAProject(int userId, int projectId);
	  List < Leave_request > getAllLeave_requests();

	  void ajouterLeave_request(Leave_request apprenant);
	  void updateLeave_request(Leave_request apprenant);
	  void validateLeave_request (int leave_requestId);
	 
	  void deleteLeave_requestById(int apprenantId);

	  List < Timesheet > getAllTimesheets();

	  void ajouterTimesheet(Timesheet apprenant);
	  void updateTimesheet(Timesheet apprenant) ;

	  void deleteTimesheetById(int apprenantId);
}
