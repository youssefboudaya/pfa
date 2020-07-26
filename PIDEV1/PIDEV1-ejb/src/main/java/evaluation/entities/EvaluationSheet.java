package evaluation.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.criteria.Fetch;

import entities.User;

@Entity
public class EvaluationSheet implements Serializable {
	private static final long serialVersionUID = -8823921117744535534L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Utilisateur subject;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Utilisateur creator;
	
	@Enumerated(EnumType.STRING)
	private EvaluationType type;
	
	private Date createdAt;
	private Date availableUntil;
	
	@Enumerated(EnumType.STRING)
	private EvaluationDecision decision;
	
	private String comment;
	
	@OneToMany(fetch=FetchType.EAGER,mappedBy="evaluationSheet",cascade=CascadeType.ALL)
	private List<Indicator> indicators; 
	
	public EvaluationSheet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EvaluationSheet(EvaluationType type, Date createdAt, Date availableUntil) {
		super();
		this.type = type;
		this.createdAt = createdAt;
		this.availableUntil = availableUntil;
	}

	public EvaluationSheet(Utilisateur subject, Utilisateur creator, EvaluationType type, Date createdAt, Date availableUntil) {
		super();
		this.subject = subject;
		this.creator = creator;
		this.type = type;
		this.createdAt = createdAt;
		this.availableUntil = availableUntil;
	}

	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public EvaluationType getType() {
		return type;
	}
	public void setType(EvaluationType type) {
		this.type = type;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getAvailableUntil() {
		return availableUntil;
	}
	public void setAvailableUntil(Date availableUntil) {
		this.availableUntil = availableUntil;
	}
	
	public EvaluationDecision getDecision() {
		return decision;
	}
	public void setDecision(EvaluationDecision decision) {
		this.decision = decision;
	}
	public Integer getId() {
		return id;
	}
	@Override
	public String toString() {
		return "EvaluationSheet [id=" + id + ", type=" + type + ", createdAt=" + createdAt + ", availableUntil="
				+ availableUntil + ", decision=" + decision + "]";
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Indicator> getIndicators() {
		return indicators;
	}

	public void setIndicators(List<Indicator> indicators) {
		this.indicators = indicators;
	}
}