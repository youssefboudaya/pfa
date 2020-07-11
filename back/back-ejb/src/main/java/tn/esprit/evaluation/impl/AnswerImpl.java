package tn.esprit.evaluation.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.evaluation.entities.Answer;
import tn.esprit.evaluation.services.AnswerServices;
import tn.esprit.evaluation.services.AnswerServicesRemote;

@Stateless
@LocalBean
public class AnswerImpl implements AnswerServices, AnswerServicesRemote{
	
	@PersistenceContext
	EntityManager em;

	@Override
	public void respondeToQuestion(Answer answer) {
		em.persist(answer);
	}

	@Override
	public void noteAnAnswer(Answer answer, Integer note) {
		answer.setScore(note);
		
		em.persist(answer);
	}
}
