package entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="payroll")
public class Payroll implements Serializable {

private static final long serialVersionUID = -8823921117744535534L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String label;
	private String family;
	
	//constructeurs 
	public Payroll() {
		super();
	}

	public Payroll(String label, String family) {
		super();
		this.label = label;
		this.family = family;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}
	
	
	
	
	
	
	
	
	
}
