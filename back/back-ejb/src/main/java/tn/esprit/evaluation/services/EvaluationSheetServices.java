package tn.esprit.evaluation.services;

import javax.ejb.Local;

import tn.esprit.evaluation.entities.EvaluationDecision;
import tn.esprit.evaluation.entities.EvaluationSheet;

@Local
public interface EvaluationSheetServices {
	void create(EvaluationSheet evaluationSheet);
	void commentOnEvaluationSheet(EvaluationSheet evaluationSheet, String comment);
	void takeDecision(EvaluationSheet evaluationSheet, EvaluationDecision evlDecision);
}
