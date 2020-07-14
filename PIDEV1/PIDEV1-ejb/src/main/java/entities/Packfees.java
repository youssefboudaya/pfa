package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity(name="packfees")
public class Packfees implements Serializable{

// Attributs	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int  id_packfees;
	
	@Temporal(TemporalType.DATE)
	private Date date_pckf;
	
	private float amount_pckf;
    private String label_pckf;
	
    
    //  constructeurs 
    public Packfees(Date date_pckf, float amount_pckf, String label_pckf) {
		super();
		this.date_pckf = date_pckf;
		this.amount_pckf = amount_pckf;
		this.label_pckf = label_pckf;
	}


	public Packfees() {
		super();
	}

	 //Getters and setters
	public int getId_packfees() {
		return id_packfees;
	}


	public void setId_packfees(int id_packfees) {
		this.id_packfees = id_packfees;
	}


	public Date getDate_pckf() {
		return date_pckf;
	}


	public void setDate_pckf(Date date_pckf) {
		this.date_pckf = date_pckf;
	}


	public float getAmount_pckf() {
		return amount_pckf;
	}


	public void setAmount_pckf(float amount_pckf) {
		this.amount_pckf = amount_pckf;
	}


	public String getLabel_pckf() {
		return label_pckf;
	}


	public void setLabel_pckf(String label_pckf) {
		this.label_pckf = label_pckf;
	}
 
    
    
   
    
    
    
    
    
}
