package entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Question {

	private Integer indicatorId;
	private String question;
	
	public Integer getIndicatorId() {
		return indicatorId;
	}
	
	@XmlAttribute(name = "indicatorId", required = true)
	public void setIndicatorId(Integer indicatorId) {
		this.indicatorId = indicatorId;
	}
	
	public String getQuestion() {
		return question;
	}
	
	@XmlAttribute(name = "question", required = true)
	public void setQuestion(String question) {
		this.question = question;
	}
	
	
}
