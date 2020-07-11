package tn.esprit.evaluation.services;

import javax.ejb.Local;

import tn.esprit.evaluation.entities.Indicator;

@Local
public interface IndicatorServices {
	void create(Indicator indicator);
}
