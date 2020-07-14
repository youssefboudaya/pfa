package entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Indicator {
	private Integer evaluationSheetId;
	private String label;
	
	public Integer getEvaluationSheetId() {
		return evaluationSheetId;
	}
	
	@XmlAttribute(name = "evaluationSheetId", required = true)
	public void setEvaluationSheetId(Integer evaluationSheetId) {
		this.evaluationSheetId = evaluationSheetId;
	}
	
	public String getLabel() {
		return label;
	}
	
	@XmlAttribute(name = "label", required = true)
	public void setLabel(String label) {
		this.label = label;
	}
}
