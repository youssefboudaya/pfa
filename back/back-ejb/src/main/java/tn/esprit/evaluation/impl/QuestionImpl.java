package tn.esprit.evaluation.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.evaluation.entities.Question;
import tn.esprit.evaluation.services.QuestionServices;
import tn.esprit.evaluation.services.QuestionServicesRemote;

@Stateless
@LocalBean
public class QuestionImpl implements QuestionServices, QuestionServicesRemote {
	@PersistenceContext
	EntityManager em;

	@Override
	public void create(Question question) {
		em.persist(question);
	}
}
