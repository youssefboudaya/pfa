package tn.esprit.evaluation.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.evaluation.entities.Indicator;
import tn.esprit.evaluation.services.IndicatorServices;
import tn.esprit.evaluation.services.IndicatorServicesRemote;

@Stateless
@LocalBean
public class IndicatorImpl implements IndicatorServices, IndicatorServicesRemote {
	@PersistenceContext
	EntityManager em;

	@Override
	public void create(Indicator indicator) {
		em.persist(indicator);
	}
}
