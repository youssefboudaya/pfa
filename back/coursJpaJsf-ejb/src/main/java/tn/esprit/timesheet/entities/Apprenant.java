package tn.esprit.timesheet.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Apprenant implements Serializable {


 /**
  * 
  */
 private static final long serialVersionUID = 1L;

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer idApprenant;

 public Integer getIdApprenant() {
	return idApprenant;
}

public void setIdApprenant(Integer idApprenant) {
	this.idApprenant = idApprenant;
}

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

public List<Centre> getCentres() {
	return centres;
}

public void setCentres(List<Centre> centres) {
	this.centres = centres;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}


private String prenom;

 private String nom;

 //@Column(unique=true)
 private String login;


 private String password;

 @ManyToMany
	//@NotNull
	private List<Centre> centres;


 public Apprenant() {
  super();
 }


 public Apprenant(String nom, String prenom, String login ,String password) {
  super();
  this.prenom = prenom;
  this.nom = nom;
  this.login = login;
  this.password = password;
 }


 





}