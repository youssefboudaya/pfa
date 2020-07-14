package evaluation.services;

import javax.ejb.Local;

import evaluation.entities.Indicator;

@Local
public interface IndicatorServices {
	void create(Indicator indicator);
	void createFromRest(Integer evaluationSheetId, String label);
	Indicator getById(Integer id);
}