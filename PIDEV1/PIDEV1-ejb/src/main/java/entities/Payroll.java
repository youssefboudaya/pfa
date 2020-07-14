package entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="payroll")
public class Payroll implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer code_payroll;
	private String label;
	private String family;
	
	//constructeurs 
	public Payroll() {
		super();
	}

	public Payroll(Integer code_payroll, String label, String family) {
		super();
		this.code_payroll = code_payroll;
		this.label = label;
		this.family = family;
	}

	public Integer getCode_payroll() {
		return code_payroll;
	}

	public void setCode_payroll(Integer code_payroll) {
		this.code_payroll = code_payroll;
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
