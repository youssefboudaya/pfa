package tn.esprit.timesheet.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import tn.esprit.evaluation.entities.EvaluationSheet;
import tn.esprit.evaluation.entities.Indicator;
@Entity
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4343374831941890073L;
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer idUser;
	
	@OneToMany(mappedBy="user")
	private List<Leave_request> leave_requests;
	
	@ManyToMany(mappedBy="users")
	private List<Project> projects;
	
	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}
	
	@OneToMany(mappedBy="creator",cascade=CascadeType.ALL)
	private List<EvaluationSheet> evaluationSheets;
}
