package evaluation.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Question implements Serializable {

	private static final long serialVersionUID = -8823921117744535534L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String question;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Indicator indicator;

	public Question(String question, Indicator indicator) {
		super();
		this.question = question;
		this.indicator = indicator;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Indicator getIndicator() {
		return indicator;
	}

	public void setIndicator(Indicator indicator) {
		this.indicator = indicator;
	}

	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + ", indicator=" + indicator + "]";
	}
}