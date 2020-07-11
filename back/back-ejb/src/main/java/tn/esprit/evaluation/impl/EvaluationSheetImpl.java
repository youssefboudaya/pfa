package tn.esprit.evaluation.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.evaluation.entities.EvaluationDecision;
import tn.esprit.evaluation.entities.EvaluationSheet;
import tn.esprit.evaluation.services.EvaluationSheetServices;
import tn.esprit.evaluation.services.EvaluationSheetServicesRemote;

@Stateless
@LocalBean
public class EvaluationSheetImpl implements EvaluationSheetServices, EvaluationSheetServicesRemote{
	
	@PersistenceContext
	EntityManager em;

	@Override
	public void create(EvaluationSheet evaluationSheet) {
		em.persist(evaluationSheet);	
	}

	@Override
	public void commentOnEvaluationSheet(EvaluationSheet evaluationSheet, String comment) {
		evaluationSheet.setComment(comment);
		em.persist(evaluationSheet);
	}

	@Override
	public void takeDecision(EvaluationSheet evaluationSheet, EvaluationDecision decision) {
		evaluationSheet.setDecision(decision);
		em.persist(evaluationSheet);
	}
}
