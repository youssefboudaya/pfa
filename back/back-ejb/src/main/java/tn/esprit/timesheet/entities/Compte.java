package tn.esprit.timesheet.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Compte
 *
 */
@Entity
@Table(name= "centre") //pour changer le nom de la Tamble Compte
public class Compte implements Serializable {

	private static long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idCentre")
	private int idCompte;
	
	private String nom ; 
	

	
	
	public List<tn.esprit.timesheet.entities.Formation> getFormations() {
		return formations;
	}

	public void setFormations(List<tn.esprit.timesheet.entities.Formation> formations) {
		this.formations = formations;
	}

	@OneToMany(mappedBy="compte",cascade=CascadeType.ALL)
	private List<tn.esprit.timesheet.entities.Formation> formations; 
	
	
	@Column(name = "nbAnne")
	private float solde;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static void setSerialversionuid(long serialversionuid) {
		serialVersionUID = serialversionuid;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Zone getZone() {
		return zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}

	@Temporal(TemporalType.DATE)
	private Date dateCréation;
	
	@Enumerated(EnumType.STRING)
	private Zone zone;
	
	@ManyToMany(mappedBy="comptes")
	private List<User>users;
	
	

	public Compte() {
		super();
	}   
	
	public Compte(float solde, Date dateCréation) {
		super();
		this.solde = solde;
		this.dateCréation = dateCréation;
	}
	
	@Override
	public String toString() {
		return "Compte [idCompte=" + idCompte + ", solde=" + solde + ", dateCréation=" + dateCréation + "]";
	}
   
	//Getters & Setters

	public int getIdCompte() {
		return this.idCompte;
	}

	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}   
	public float getSolde() {
		return solde;
	}
	public void setSolde(float solde) {
		this.solde = solde;
	}
	public Date getDateCréation() {
		return this.dateCréation;
	}

	public void setDateCréation(Date dateCréation) {
		this.dateCréation = dateCréation;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public Compte( String nom , float solde, Zone zone) {
		super();

		this.nom = nom;
	
		this.solde = solde;
	
		this.zone = zone;
		
	}

	
	
	
}
