//package entities;
//
//import java.util.Set;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToMany;
//
//@Entity
//public class apprenantId {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id ; 
//	
//	@Column(name ="prenom")
//	private String prenom ; 
//
//	
//	@Column(name ="n")
//	private Long coef ; 
//	
//	
//	@ManyToMany(mappedBy = "matieres")
//	Set<Etudiant> etudiants;
//
//
//	public Long getId() {
//		return id;
//	}
//
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//
//	public String getNomMatiere() {
//		return nomMatiere;
//	}
//
//
//	public void setNomMatiere(String nomMatiere) {
//		this.nomMatiere = nomMatiere;
//	}
//
//
//	public Long getCoef() {
//		return coef;
//	}
//
//
//	public void setCoef(Long coef) {
//		this.coef = coef;
//	}
//
//
//	public Set<Etudiant> getEtudiants() {
//		return etudiants;
//	}
//
//
//	public void setEtudiants(Set<Etudiant> etudiants) {
//		this.etudiants = etudiants;
//	}
//	
//	
//}
//
//
