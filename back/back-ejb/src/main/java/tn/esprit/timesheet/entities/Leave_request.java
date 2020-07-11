package tn.esprit.timesheet.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
@Entity
public class Leave_request implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8823921117744535534L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idLeave_request;
	private String title;
	
	private String status;
	@Temporal(TemporalType.DATE)
	private Date date;
	@ManyToOne
	private User user;
	
	public Integer getIdLeave_request() {
		return idLeave_request;
	}

	public void setIdLeave_request(Integer idLeave_request) {
		this.idLeave_request = idLeave_request;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	
	
	
	

}
