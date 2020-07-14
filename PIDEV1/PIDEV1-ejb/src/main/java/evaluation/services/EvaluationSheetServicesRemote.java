package evaluation.services;

import java.util.List;

import javax.ejb.Remote;

import evaluation.entities.EvaluationDecision;
import evaluation.entities.EvaluationSheet;
import evaluation.entities.EvaluationType;

@Remote
public interface EvaluationSheetServicesRemote {
	void create(EvaluationSheet evaluationSheet);
	void createFromRest(Integer subjectId, Integer creatorId, EvaluationType type, String createdAt, String availableUntil);
	List<EvaluationSheet> get();
	EvaluationSheet getById(Integer evaluationSheetId);
	void commentOnEvaluationSheet(EvaluationSheet evaluationSheet, String comment);
	void commentOnEvaluationSheetFromRest(Integer evaluationSheetId, String comment);
	void takeDecision(EvaluationSheet evaluationSheet, EvaluationDecision evlDecision);
	void takeDecisionFromRest(Integer evaluationSheetId, String evlDecision);
}