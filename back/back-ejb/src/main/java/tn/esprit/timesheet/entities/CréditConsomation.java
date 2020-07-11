package tn.esprit.timesheet.entities;

import tn.esprit.timesheet.entities.Credit;
import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: CréditConsomation
 *
 */
@Entity

public class CréditConsomation extends Credit implements Serializable {

	
	private float plafond;
	private static final long serialVersionUID = 1L;

	public CréditConsomation() {
		super();
	}   
	public float getPlafond() {
		return this.plafond;
	}

	public void setPlafond(float plafond) {
		this.plafond = plafond;
	}
   
}
