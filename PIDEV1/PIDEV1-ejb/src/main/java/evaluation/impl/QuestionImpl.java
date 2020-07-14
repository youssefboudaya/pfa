package evaluation.impl;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import evaluation.entities.Indicator;
import evaluation.entities.Question;
import evaluation.services.IndicatorServices;
import evaluation.services.QuestionServices;
import evaluation.services.QuestionServicesRemote;

@Stateless
@LocalBean
public class QuestionImpl implements QuestionServices, QuestionServicesRemote {
	@PersistenceContext(unitName= "primary")
	EntityManager em;
	
	@EJB
	IndicatorServices indicatorServices;

	@Override
	public void create(Question question) {
		em.persist(question);
	}

	@Override
	public void createFromRest(Integer indicatorId, String question) {
		Indicator indicator = indicatorServices.getById(indicatorId);
		
		this.create(new Question(question, indicator));
	}

	@Override
	public Question getById(Integer id) {
		return em.find(Question.class, id);
	}
}