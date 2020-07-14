package pidev;

import java.util.List;

import entities.*;
import javax.ejb.Local;
@Local
public interface TimesheetServiceLocal  {

 

  List < Project > getAllProjects();
  void ajouterProject(Project project);
  void updateProject(Project project);
 
  void deleteProjectById(int projectId);
   void affecterUserAProject(int userId, int projectId);
  List < Leave_request > getAllLeave_requests();

  void ajouterLeave_request(Leave_request leave_request);
  void updateLeave_request(Leave_request leave_request);
 
  void validateLeave_request (int leave_requestId);

 
  void deleteLeave_requestById(int leave_requestId);
  List < Timesheet > getAllTimesheets();

  void ajouterTimesheet(Timesheet timesheet);
  void updateTimesheet(Timesheet timesheet);

 

  void deleteTimesheetById(int timesheetId);
 

}