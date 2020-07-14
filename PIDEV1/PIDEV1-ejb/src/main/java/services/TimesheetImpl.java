package services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.*;
import pidev.TimesheetServiceRemote;
import pidev.TimesheetServiceLocal;
@Stateless

public class TimesheetImpl implements TimesheetServiceLocal, TimesheetServiceRemote{
	@PersistenceContext(unitName = "primary")
	 EntityManager em;
	@Override
	 public List < Project > getAllProjects() {
		 List < Project > emp = em.createQuery("Select e from Project e", Project.class).getResultList();
		 return emp;
	 }
	@Override
	 public void ajouterProject(Project project) {
		 em.persist(project);
	 }
	@Override
	 public void updateProject(Project project) {
		 Project emp = em.find(Project.class, project.getIdProject());
		 emp.setTitle(project.getTitle());
		 emp.setDescription(project.getDescription());
	 }

	@Override
	 public void deleteProjectById(int projectId) {
	  Project project = em.find(Project.class, projectId);


	  for(User dep : project.getUsers()){
	  	dep.getProjects().remove(project);
	  	}

	  em.remove(project);
	 }
	@Override
	 public void affecterUserAProject(int userId, int projectId) {
			Project projectt = em.find(Project.class,projectId);
			User userr = em.find(User.class, userId);

			if(projectt.getUsers() == null){
				List<User> employes = new ArrayList<>();
				employes.add(userr);
				projectt.setUsers(employes);
			}else{
				projectt.getUsers().add(userr);
			}

			//em.merge(depManagedEntity);
		}
	@Override
	 public List < Leave_request > getAllLeave_requests() {
		 List < Leave_request > emp = em.createQuery("Select e from Leave_request e", Leave_request.class).getResultList();
		 return emp;
	 }
	 @Override
	 public void ajouterLeave_request(Leave_request leave_request) {
		 em.persist(leave_request);
	 }
	 @Override
	 public void updateLeave_request(Leave_request leave_request) {
		 Leave_request emp = em.find(Leave_request.class, leave_request.getIdLeave_request());
	  	 emp.setDate(leave_request.getDate());
	  	 emp.setTitle(leave_request.getTitle());
	  	 emp.setStatus(leave_request.getStatus());
	  	 emp.setUser(leave_request.getUser());
	 }
	 @Override
	 public void validateLeave_request (int leave_requestId)
	 {
		 Leave_request emp = em.find(Leave_request.class, leave_requestId);
	  	 emp.setStatus("validé");
	 }

	 @Override
	 public void deleteLeave_requestById(int leave_requestId) {
		 Leave_request leave_request = em.find(Leave_request.class, leave_requestId);
		 em.remove(leave_request);
	 }
	 @Override
	 public List < Timesheet > getAllTimesheets() {
		 List < Timesheet > emp = em.createQuery("Select e from Timesheet e", Timesheet.class).getResultList();
	  	return emp;
	 }
	 @Override
	 public void ajouterTimesheet(Timesheet timesheet) {
		 em.persist(timesheet);
	 }
	 @Override
	 public void updateTimesheet(Timesheet timesheet) {
		 Timesheet emp = em.find(Timesheet.class, timesheet.getIdTimesheet());
		 emp.setDuree(timesheet.getDuree());
		 emp.setActivity(timesheet.getActivity());
		 emp.setUser(timesheet.getUser());
		 emp.setProject(timesheet.getProject());
	 }

	 
	 @Override
	 public void deleteTimesheetById(int timesheetId) {
		 Timesheet timesheet = em.find(Timesheet.class, timesheetId);
		 em.remove(timesheet);
	 }
	/*@Override
	public void affecterUserAProject(User user, Project project) {
		// TODO Auto-generated method stub
		
	}*/
}
