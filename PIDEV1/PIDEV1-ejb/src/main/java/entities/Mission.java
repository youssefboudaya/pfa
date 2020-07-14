package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="mission")
public class Mission implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int  num_mission;
	@Temporal(TemporalType.DATE)
	private Date start_date;
	@Temporal(TemporalType.DATE)
	private Date end_date;
	
	private int supp_num;

	@Temporal(TemporalType.DATE)
	private Date update_date;

	private char state;
	
	private String comments;
	
	private int matcollab;
	
	
	
	 @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "manager_id", referencedColumnName = "id", insertable=false, updatable=false)
	private User user;
	
	
	
	/*
	public User getCollaborator() {
		return collaborator;
	}

	public void setCollaborator(User collaborator) {
		this.collaborator = collaborator;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	private User  collaborator;
	@ManyToOne(fetch = FetchType.EAGER)  
	private User  user;
	*/
	public Mission() {
		super();
	}

	public int getNum_mission() {
		return num_mission;
	}

	public void setNum_mission(int num_mission) {
		this.num_mission = num_mission;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public int getSupp_num() {
		return supp_num;
	}

	public void setSupp_num(int supp_num) {
		this.supp_num = supp_num;
	}

	public Date getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}

	public char getState() {
		return state;
	}

	public void setState(char state) {
		this.state = state;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public int getMatcollab() {
		return matcollab;
	}

	public void setMatcollab(int matcollab) {
		this.matcollab = matcollab;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
	
	
	
	
	
	
}
