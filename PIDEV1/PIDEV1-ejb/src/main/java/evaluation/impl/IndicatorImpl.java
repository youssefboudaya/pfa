package evaluation.impl;


import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import evaluation.entities.EvaluationSheet;
import evaluation.entities.Indicator;
import evaluation.services.EvaluationSheetServices;
import evaluation.services.IndicatorServices;
import evaluation.services.IndicatorServicesRemote;

@Stateless
@LocalBean
public class IndicatorImpl implements IndicatorServices, IndicatorServicesRemote {
	@PersistenceContext(unitName= "primary")
	EntityManager em;
	
	@EJB
	EvaluationSheetServices evaluationSheetServices;

	@Override
	public Integer create(Indicator indicator) {
		em.persist(indicator);
		em.flush();

		return indicator.getId();
	}

	@Override
	public Integer createFromRest(Integer evaluationSheetId, String label) {
		EvaluationSheet evaluationSheet = evaluationSheetServices.getById(evaluationSheetId);
		Indicator indicator = new Indicator(label, evaluationSheet);
		
		em.persist(indicator);
		em.flush();

		return indicator.getId();
	}

	@Override
	public Indicator getById(Integer id) {
		return em.find(Indicator.class, id);
	}
}