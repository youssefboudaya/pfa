package tn.esprit.evaluation.services;

import javax.ejb.Remote;

import tn.esprit.evaluation.entities.EvaluationDecision;
import tn.esprit.evaluation.entities.EvaluationSheet;

@Remote
public interface EvaluationSheetServicesRemote {
	void create(EvaluationSheet evaluationSheet);
	void commentOnEvaluationSheet(EvaluationSheet evaluationSheet, String comment);
	void takeDecision(EvaluationSheet evaluationSheet, EvaluationDecision evlDecision);
}
