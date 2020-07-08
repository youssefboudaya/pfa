package tn.esprit.timesheet.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
@Entity
public class Formation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8823921117744535534L;
	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer idFormation;
	
	public Integer getIdFormation() {
		return idFormation;
	}

	public void setIdFormation(Integer idFormation) {
		this.idFormation = idFormation;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Integer getDuree() {
		return duree;
	}

	public void setDuree(Integer duree) {
		this.duree = duree;
	}

	public NiveauFormation getNiveauFormation() {
		return niveauFormation;
	}

	public void setNiveauFormation(NiveauFormation niveauFormation) {
		this.niveauFormation = niveauFormation;
	}

	public Centre getCentre() {
		return centre;
	}

	public void setCentre(Centre centre) {
		this.centre = centre;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private String titre;
	
	private Integer duree;
	
	@Enumerated(EnumType.STRING)
	//@NotNull
	private NiveauFormation niveauFormation;
	
	@ManyToOne
	private Centre centre;
	
	

}
