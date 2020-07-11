package tn.esprit.timesheet.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Formation implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codeFormation;
	
	@Column(name ="titre")
	private String titre ;
	
	@Column(name ="duree")
	private int duree ;

	@Enumerated(EnumType.STRING)
	private NiveauFormation formation;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Compte compte;

	public int getCodeFormation() {
		return codeFormation;
	}

	public void setCodeFormation(int codeFormation) {
		this.codeFormation = codeFormation;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public NiveauFormation getFormation() {
		return formation;
	}

	public void setFormation(NiveauFormation formation) {
		this.formation = formation;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public Formation(String titre, int duree, NiveauFormation formation) {
		super();
		this.titre = titre;
		this.duree = duree;
		this.formation = formation;
		
	}

	public Formation() {
		super();
	}
	
	
	
	



}
