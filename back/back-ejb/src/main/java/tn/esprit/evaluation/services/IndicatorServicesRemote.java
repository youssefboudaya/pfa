package tn.esprit.evaluation.services;

import javax.ejb.Remote;

import tn.esprit.evaluation.entities.Indicator;

@Remote
public interface IndicatorServicesRemote {
	void create(Indicator indicator);
}
