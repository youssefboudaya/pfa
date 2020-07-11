package tn.esprit.evaluation.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Indicator {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String label;

	@ManyToOne(cascade = CascadeType.ALL)
	private EvaluationSheet evaluationSheet;
	
	@OneToMany(mappedBy="indicator",cascade=CascadeType.ALL)
	private List<Question> questions; 
	
	public Indicator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Indicator(String label) {
		super();
		this.label = label;
	}

	public Indicator(String label, EvaluationSheet evaluationSheet) {
		super();
		this.label = label;
		this.evaluationSheet = evaluationSheet;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Indicator [id=" + id + ", label=" + label + "]";
	}
}
