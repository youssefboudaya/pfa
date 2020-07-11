package tn.esprit.timesheet.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import tn.esprit.employe.entities.Employe;
import tn.esprit.employe.entities.Mission;
@Entity
public class Timesheet implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 321958009689014279L;
	@ManyToOne
    @JoinColumn(name = "idEmploye", referencedColumnName = "id", insertable=false, updatable=false)
	private Employe employe;
	//idMission est a la fois primary key et foreign key
		@ManyToOne
	    @JoinColumn(name = "idMission", referencedColumnName = "id", insertable=false, updatable=false)
		private Mission mission;
	private Integer duree;
	private String activity;
	@OneToOne
	private Project project;
	@ManyToOne
	private User user;
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer idTimesheet;
	
	public Integer getIdTimesheet() {
		return idTimesheet;
	}

	public void setIdTimesheet(Integer idTimesheet) {
		this.idTimesheet = idTimesheet;
	}
	
	public Integer getDuree() {
		return duree;
	}
	public void setDuree(Integer duree) {
		this.duree = duree;
	}
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
