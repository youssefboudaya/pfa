package entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import evaluation.entities.EvaluationSheet;

@Entity(name="user")
public class User implements Serializable {
	private static final long serialVersionUID = 4343374831941890073L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
    
	private String nom;
    private String prenom;
    private Role role;
    private int manger_id;
    
    @OneToMany(mappedBy="user",fetch = FetchType.EAGER)
	private List<Mission> missions;
    
	/*@OneToMany(fetch = FetchType.EAGER,mappedBy="user")
	private List<Mission> missions;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy="user")
	private List<Mission> colloborator;

    
	public List<Mission> getMissions() {
		return missions;
	}

	public void setMissions(List<Mission> missions) {
		this.missions = missions;
	}

	public List<Mission> getColloborator() {
		return colloborator;
	}

	public void setColloborator(List<Mission> colloborator) {
		this.colloborator = colloborator;
	}
*/
    
    
	public int getid() {
		return id;
	}

	public User(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public void setid(int id) {
		this.id = id;
	}

	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public User() {
		super();
	}
	
	
	
	
	
	

	public User(String nom, String prenom, Role role, int matrep) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.role = role;
	//	this.matrep = matrep;
	}

	public User(int id) {
		super();
		this.id = id;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public int getManger_id() {
		return manger_id;
	}

	public void setManger_id(int manger_id) {
		this.manger_id = manger_id;
	}

	public List<Mission> getMissions() {
		return missions;
	}

	public void setMissions(List<Mission> missions) {
		this.missions = missions;
	}

	
	
	
	@OneToMany(mappedBy="creator",cascade=CascadeType.ALL)
	private List<EvaluationSheet> evaluationSheets;
	
	
	
}
