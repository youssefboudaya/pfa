package tn.esprit.javaee.TimesheetServeur.presentation.mbeans;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import tn.esprit.timesheet.entities.*;
import tn.esprit.timesheet.services.impl.ExamenService;


@ManagedBean
@SessionScoped
public class EmployeBean {
	
 private String prenom;
 private String nom;
 private String password;
 private String login;
 private List <Centre>centres;
 
 @EJB
 ExamenService examenService;
 
 
 public String getPrenom() {
  return prenom;
 }

 public void setPrenom(String prenom) {
  this.prenom = prenom;
 }

 public String getNom() {
  return nom;
 }

 public void setNom(String nom) {
  this.nom = nom;
 }

 public String getPassword() {
  return password;
 }

 public void setPassword(String password) {
  this.password = password;
 }

 public String getLogin() {
  return login;
 }

 public void setLogin(String login) {
  this.login = login;
 }


 public ExamenService getExamenService() {
  return examenService;
 }

 public void setExamenService(ExamenService examenService) {
  this.examenService = examenService;
 }

 

 public List<Centre> getCentres() {
		return centres;
	}

	public void setCentres(List<Centre> centres) {
		this.centres = centres;
	}



}