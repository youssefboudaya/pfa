package evaluation.services;

import java.util.List;

import javax.ejb.Remote;

import evaluation.entities.EvaluationDecision;
import evaluation.entities.EvaluationSheet;
import evaluation.entities.EvaluationType;
import evaluation.entities.Utilisateur;

@Remote
public interface EvaluationSheetServicesRemote {
	Integer create(EvaluationSheet evaluationSheet);
	Integer createFromRest(Integer subjectId, Integer creatorId, EvaluationType type, String createdAt, String availableUntil);
	List<EvaluationSheet> get();
	EvaluationSheet getById(Integer evaluationSheetId);
	void commentOnEvaluationSheet(EvaluationSheet evaluationSheet, String comment);
	void commentOnEvaluationSheetFromRest(Integer evaluationSheetId, String comment);
	void takeDecision(EvaluationSheet evaluationSheet, EvaluationDecision evlDecision);
	void takeDecisionFromRest(Integer evaluationSheetId, String evlDecision);
	List<EvaluationSheet> getUserEvaluationSheets(String email);
	Utilisateur getUser(String email);
	List<Utilisateur> getAllUsers();
}