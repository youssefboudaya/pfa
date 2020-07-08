package tn.esprit.timesheet.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Centre implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3416485587005951462L;
	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer idCentre;

	public Integer getIdCentre() {
		return idCentre;
	}

	public void setIdCentre(Integer idCentre) {
		this.idCentre = idCentre;
	}

	public Zone getZone() {
		return zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getNbAnneesAnciennete() {
		return nbAnneesAnciennete;
	}

	public void setNbAnneesAnciennete(Integer nbAnneesAnciennete) {
		this.nbAnneesAnciennete = nbAnneesAnciennete;
	}

	public List<Apprenant> getApprenants() {
		return apprenants;
	}

	public void setApprenants(List<Apprenant> apprenants) {
		this.apprenants = apprenants;
	}

	public List<Formation> getFormations() {
		return formations;
	}

	public void setFormations(List<Formation> formations) {
		this.formations = formations;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Enumerated(EnumType.STRING)
	//@NotNull
	private Zone zone;

	 private String nom;
	 
	 private Integer nbAnneesAnciennete;
	 
	 @ManyToMany(mappedBy="centres")
	//@NotNull
	private List<Apprenant> apprenants;
	 
	 @OneToMany(mappedBy="centre")
	 private List<Formation> formations;
	 
	 public Centre(Zone zone, String nom, Integer nbAnneesAnciennete)
	 {
		 this.zone = zone;
		 this.nom = nom;
		 this.nbAnneesAnciennete = nbAnneesAnciennete;
	 }

}
