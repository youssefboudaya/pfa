package entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;


@Entity(name="payroll")
public class Payroll implements Serializable {

	@EmbeddedId
	private String code_payroll;
	private String label;
	private String family;
	
	//constructeurs 
	public Payroll() {
		super();
	}

	public Payroll(String code_payroll, String label, String family) {
		super();
		this.code_payroll = code_payroll;
		this.label = label;
		this.family = family;
	}

	public String getCode_payroll() {
		return code_payroll;
	}

	public void setCode_payroll(String code_payroll) {
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
