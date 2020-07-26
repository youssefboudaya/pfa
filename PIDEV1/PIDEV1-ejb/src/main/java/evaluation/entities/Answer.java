package evaluation.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import entities.User;

@Entity
public class Answer implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Utilisateur employe;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Question question;
	
	private String reponse;
	
	private Integer score;

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answer(Question question, String reponse) {
		super();
		this.question = question;
		this.reponse = reponse;
		this.score = 0;
	}

	public Answer(Utilisateur employe, Question question, String reponse) {
		super();
		this.employe = employe;
		this.question = question;
		this.reponse = reponse;
		this.score = 0;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Utilisateur getEmploye() {
		return employe;
	}

	public void setEmploye(Utilisateur employe) {
		this.employe = employe;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public String getReponse() {
		return reponse;
	}

	public void setReponse(String reponse) {
		this.reponse = reponse;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", employe=" + employe + ", question=" + question + ", reponse=" + reponse
				+ ", score=" + score + "]";
	}	
}