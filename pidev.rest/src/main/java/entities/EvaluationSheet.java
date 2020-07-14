package entities;

import java.sql.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import evaluation.entities.EvaluationType;

@XmlRootElement
public class EvaluationSheet {
	private Integer creatorId;
	private Integer subjectId;
	private EvaluationType type;
	private String createdAt;
	private String availableUntil;
	
	public Integer getCreatorId() {
		return creatorId;
	}
	
	@XmlAttribute(name = "creatorId", required = true)
	public void setCreatorId(Integer creatorId) {
		this.creatorId = creatorId;
	}
	
	public Integer getSubjectId() {
		return subjectId;
	}
	
	@XmlAttribute(name = "subjectId", required = true)
	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}
	
	@XmlAttribute(name = "type", required = true)
	public EvaluationType getType() {
		return type;
	}

	public void setType(EvaluationType type) {
		this.type = type;
	}

	public String getCreatedAt() {
		return createdAt;
	}
	
	@XmlAttribute(name = "createdAt", required = true)
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	
	public String getAvailableUntil() {
		return availableUntil;
	}
	
	@XmlAttribute(name = "availableUntil", required = true)
	public void setAvailableUntil(String availableUntil) {
		this.availableUntil = availableUntil;
	}
}
