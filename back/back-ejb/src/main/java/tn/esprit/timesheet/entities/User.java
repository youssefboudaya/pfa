package tn.esprit.timesheet.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Client
 *
 */
@Entity
@Table(name = "Apprenant")
public class User implements Serializable {

	@Id
	private String idUser;
	private String nom;
	private String prenom;
	@Column(unique=true)
	private String login;
	private String pass;
	@Enumerated(EnumType.STRING)
	private Role role;
	@Enumerated(EnumType.STRING)
	private Sexe sexe;
	
	@ManyToMany(fetch=FetchType.EAGER)
	private List<Compte> comptes;
	
	@OneToMany(mappedBy="user",cascade=CascadeType.ALL)//cascadeRemove : si on supprime l'utilisateur , tous ces credits seront supprimés automatiquement 
	private List<Credit> credits; 
	
	@OneToMany(mappedBy="user")
	private List<Leave_request> leave_requests;
	
	@ManyToMany(mappedBy="users")
	private List<Project> projects;
	
	
	
	
	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}
	

	public User(String idUser, String nom, String prenom, String login, String pass,Role role,Sexe sexe) {
		super();
		this.idUser = idUser;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.pass = pass;
		this.role=role;
		this.sexe=sexe;
	}
	
	//Getters & Setters
	public Sexe getSexe() {
		return sexe;
	}


	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}


	

	public String getIdUser() {
		return idUser;
	}


	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}


	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public List<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

	public List<Credit> getCredits() {
		return credits;
	}

	public void setCredits(List<Credit> credits) {
		this.credits = credits;
	}

	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}

	public List<Leave_request> getLeave_requests() {
		return leave_requests;
	}

	public void setLeave_requests(List<Leave_request> leave_requests) {
		this.leave_requests = leave_requests;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login + ", pass="
				+ pass + "]";
	}

}



