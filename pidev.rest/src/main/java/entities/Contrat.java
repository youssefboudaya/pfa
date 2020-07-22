package entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Contrat {

	private Integer userId;
	private float salaire;
	
	public Integer getUserId() {
		return userId;
	}
	
	@XmlAttribute(name = "userId", required = true)
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public float getSalaire() {
		return salaire;
	}
	
	@XmlAttribute(name = "salaire", required = true)
	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}
	
	
}
