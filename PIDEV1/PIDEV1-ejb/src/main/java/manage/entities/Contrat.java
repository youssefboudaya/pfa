package manage.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import evaluation.entities.Utilisateur;

@Entity
public class Contrat implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private float salaire;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Utilisateur user;

	public Contrat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contrat(float salaire, Utilisateur user) {
		super();
		this.salaire = salaire;
		this.user = user;
	}

	public float getSalaire() {
		return salaire;
	}

	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}

	public Utilisateur getUser() {
		return user;
	}

	public void setUser(Utilisateur user) {
		this.user = user;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Contrat [id=" + id + ", salaire=" + salaire + ", user=" + user + "]";
	}
}
