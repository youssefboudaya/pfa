package entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Answer {

	private Integer questionId;
	private Integer employeId;
	private String response;
	private Integer score;
	
	public Integer getQuestionId() {
		return questionId;
	}
	public Integer getEmployeId() {
		return employeId;
	}
	public String getResponse() {
		return response;
	}
	public Integer getScore() {
		return score;
	}
	
	@XmlAttribute(name = "questionId", required = true)
	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}
	
	@XmlAttribute(name = "employeId", required = true)
	public void setEmployeId(Integer employeId) {
		this.employeId = employeId;
	}
	
	@XmlAttribute(name = "response", required = true)
	public void setResponse(String response) {
		this.response = response;
	}
	
	@XmlAttribute(name = "score")
	public void setScore(Integer score) {
		this.score = score;
	}
	
	
}
