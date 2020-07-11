package tn.esprit.timesheet.entities;

import tn.esprit.timesheet.entities.Credit;
import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: CreditImmobilier
 *
 */
@Entity

public class CreditImmobilier extends Credit implements Serializable {

	
	private String Immobilier;
	private float valeur;
	private static final long serialVersionUID = 1L;

	public CreditImmobilier() {
		super();
	}   
	
	public CreditImmobilier(float taux,String immobilier, float valeur) {
		super(taux);
		Immobilier = immobilier;
		this.valeur = valeur;
	}
	

	//Getters & Setters
	public String getImmobilier() {
		return this.Immobilier;
	}

	public void setImmobilier(String Immobilier) {
		this.Immobilier = Immobilier;
	}   
	public float getValeur() {
		return this.valeur;
	}

	public void setValeur(float valeur) {
		this.valeur = valeur;
	}
   
}
