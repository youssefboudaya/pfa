package tn.esprit.timesheet.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Credit
 *
 */
@Entity

@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
/*
  Cette d'héritage  stratégie est par défaut , elle va générer une seule table dans la base de donnée avec un attribut Dtype
qui va permettre de différencier le type de  crédit.
Les autre stratégies sont table TABLE_PER_CLASS et  JOINED

*/
public class Credit implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCredit;
	private float taux;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	private User user;
	
	

	public Credit() {
		super();
	}

	public Credit(float taux) {
		super();
		this.taux = taux;
	}
	
	@Override
	public String toString() {
		return "Credit [idCredit=" + idCredit + ", taux=" + taux + "]";
	}

	
	//Getters & Setters

	public int getIdCredit() {
		return this.idCredit;
	}

	public void setIdCredit(int idCredit) {
		this.idCredit = idCredit;
	}

	public float getTaux() {
		return this.taux;
	}

	public void setTaux(float taux) {
		this.taux = taux;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	
	
}
