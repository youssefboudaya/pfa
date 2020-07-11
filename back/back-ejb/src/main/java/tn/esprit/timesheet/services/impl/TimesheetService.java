package tn.esprit.timesheet.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;

import tn.esprit.timesheet.entities.*;
import tn.esprit.timesheet.services.interfaces.TimesheetServiceRemote;

@Stateless
@LocalBean
public class TimesheetService implements TimesheetServiceRemote {

 @PersistenceContext(unitName = "imputation-ejb")
 EntityManager em;

 public List < Project > getAllProjects() {
	 List < Project > emp = em.createQuery("Select e from Project e", Project.class).getResultList();
	 return emp;
 }

 public void ajouterProject(Project apprenant) {
	 em.persist(apprenant);
 }
 public void updateProject(Project apprenant) {
	 Project emp = em.find(Project.class, apprenant.getIdProject());
	 emp.setTitle(apprenant.getTitle());
	 emp.setDescription(apprenant.getDescription());
 }

 
 public void deleteProjectById(int apprenantId) {
  Project apprenant = em.find(Project.class, apprenantId);


  for(User dep : apprenant.getUsers()){
  	dep.getProjects().remove(apprenant);
  	}

  em.remove(apprenant);
 }
 public void affecterUserAProject(int employeId, int depId) {
		Project depManagedEntity = em.find(Project.class, depId);
		User employeManagedEntity = em.find(User.class, employeId);

		if(depManagedEntity.getUsers() == null){
			List<User> employes = new ArrayList<>();
			employes.add(employeManagedEntity);
			depManagedEntity.setUsers(employes);
		}else{
			depManagedEntity.getUsers().add(employeManagedEntity);
		}

		//em.merge(depManagedEntity);
	}
 public List < Leave_request > getAllLeave_requests() {
	 List < Leave_request > emp = em.createQuery("Select e from Leave_request e", Leave_request.class).getResultList();
	 return emp;
 }

 public void ajouterLeave_request(Leave_request apprenant) {
	 em.persist(apprenant);
 }
 public void updateLeave_request(Leave_request apprenant) {
	 Leave_request emp = em.find(Leave_request.class, apprenant.getIdLeave_request());
  	 emp.setDate(apprenant.getDate());
  	 emp.setTitle(apprenant.getTitle());
  	 emp.setStatus(apprenant.getStatus());
  	 emp.setUser(apprenant.getUser());
 }

 
 public void deleteLeave_requestById(int apprenantId) {
	 Leave_request apprenant = em.find(Leave_request.class, apprenantId);
	 em.remove(apprenant);
 }

 public List < Timesheet > getAllTimesheets() {
	 List < Timesheet > emp = em.createQuery("Select e from Timesheet e", Timesheet.class).getResultList();
  	return emp;
 }

 public void ajouterTimesheet(Timesheet apprenant) {
	 em.persist(apprenant);
 }
 public void updateTimesheet(Timesheet apprenant) {
	 Timesheet emp = em.find(Timesheet.class, apprenant.getIdTimesheet());
	 emp.setDuree(apprenant.getDuree());
	 emp.setActivity(apprenant.getActivity());
	 emp.setUser(apprenant.getUser());
	 emp.setProject(apprenant.getProject());
 }


 public void deleteTimesheetById(int apprenantId) {
	 Timesheet apprenant = em.find(Timesheet.class, apprenantId);
	 em.remove(apprenant);
 }

}