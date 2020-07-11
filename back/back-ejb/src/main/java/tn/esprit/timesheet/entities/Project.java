package tn.esprit.timesheet.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
@Entity
public class Project implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8823921117744535534L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProject;
	@ManyToMany
	private List<User> users;
	private String title;
	
	private String description;
	public Integer getIdProject() {
		return idProject;
	}

	public void setIdProject(Integer idProject) {
		this.idProject = idProject;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDuree() {
		return description;
	}

	public void setDuree(String description) {
		this.description = description;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	
	
	

}
