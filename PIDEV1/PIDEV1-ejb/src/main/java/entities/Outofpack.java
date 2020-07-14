package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="outofpack")
public class Outofpack implements Serializable {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int  id_outofp;
	@Temporal(TemporalType.DATE)
	private Date date;
	private float amount;
    private String label;
	
    public Outofpack(Date date, float amount, String label) {
		super();
		this.date = date;
		this.amount = amount;
		this.label = label;
		
	}

	public Outofpack() {
		super();
	}

	public int getId_outofp() {
		return id_outofp;
	}

	public void setId_outofp(int id_outofp) {
		this.id_outofp = id_outofp;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
    
    
    
    
    
    
    
    
    
    


}
