package evaluation.services;

import java.sql.Date;
import java.util.List;

import javax.ejb.Local;

import evaluation.entities.EvaluationDecision;
import evaluation.entities.EvaluationSheet;
import evaluation.entities.EvaluationType;
import evaluation.entities.Utilisateur;

@Local
public interface EvaluationSheetServices {
	void create(EvaluationSheet evaluationSheet);
	void createFromRest(Integer subjectId, Integer creatorId, EvaluationType type, String createdAt, String availableUntil);
	EvaluationSheet getById(Integer evaluationSheetId);
	List<EvaluationSheet> get();
	void commentOnEvaluationSheet(EvaluationSheet evaluationSheet, String comment);
	void commentOnEvaluationSheetFromRest(Integer evaluationSheetId, String comment);
	void takeDecision(EvaluationSheet evaluationSheet, EvaluationDecision evlDecision);
	void takeDecisionFromRest(Integer evaluationSheetId, String evlDecision);
}