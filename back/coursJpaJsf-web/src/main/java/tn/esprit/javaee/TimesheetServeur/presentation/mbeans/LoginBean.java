package tn.esprit.javaee.TimesheetServeur.presentation.mbeans;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.validation.constraints.Null;

import tn.esprit.timesheet.entities.*;
import tn.esprit.timesheet.services.impl.*;



@ManagedBean
@SessionScoped
public class LoginBean {
 private String login;
 private String password;
 private Apprenant apprenant;
 private boolean loggedIn;

 //injection de dépendences
 @EJB
 ExamenService examenService;

 public String getLogin() {
  return login;
 }

 public void setLogin(String login) {
  this.login = login;
 }

 public String getPassword() {
  return password;
 }

 public void setPassword(String password) {
  this.password = password;
 }


 public boolean isLoggedIn() {
  return loggedIn;
 }

 public void setLoggedIn(boolean loggedIn) {
  this.loggedIn = loggedIn;
 }

 public ExamenService getEmployeService() {
  return examenService;
 }

 public void setEmployeService(ExamenService examenService) {
  this.examenService = examenService;
 }

 public String doLogin() {
  String navigateTo = "null";
  apprenant = examenService.getApprenantByEmailAndPassword(login, password);
  if (apprenant != null ) {
   //navigateTo="/pages/welcome?faces-redirect=true";
   navigateTo = "/pages/gererEmployes?faces-redirect=true";

   loggedIn = true;
  } else {
	  FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
	  return "/erreur?faces-redirect=true";
  }
  return navigateTo;
 }

 public Apprenant getEmploye() {
  return apprenant;
 }

 public void setEmploye(Apprenant apprenant) {
  this.apprenant = apprenant;
 }

 public String doLogout() {
  FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
  return "/login?faces-redirect=true";
 }
}