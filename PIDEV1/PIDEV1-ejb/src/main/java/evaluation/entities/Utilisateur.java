package evaluation.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import evaluation.entities.EvaluationSheet;

@Entity
public class Utilisateur implements Serializable {
	private static final long serialVersionUID = 4343374831941890073L;
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer idUser;
	 private String name;
	 private String email;
	 private String role;
	 
	
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<EvaluationSheet> getEvaluationSheets() {
		return evaluationSheets;
	}

	public void setEvaluationSheets(List<EvaluationSheet> evaluationSheets) {
		this.evaluationSheets = evaluationSheets;
	}

	public Utilisateur(String email) {
		super();
		this.email = email;
		this.role = "employe";
	}
	
	

	public Utilisateur(String name, String email) {
		super();
		this.name = name;
		this.email = email;
		this.role = "employee";
	}

	public Utilisateur(String name, String email, String role) {
		super();
		this.name = name;
		this.email = email;
		this.role = role;
	}

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@OneToMany(fetch=FetchType.EAGER,mappedBy="creator",cascade=CascadeType.ALL)
	private List<EvaluationSheet> evaluationSheets;
}
