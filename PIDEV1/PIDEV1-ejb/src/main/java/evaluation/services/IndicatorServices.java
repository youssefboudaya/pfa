package evaluation.services;

import javax.ejb.Local;

import evaluation.entities.Indicator;

@Local
public interface IndicatorServices {
	Integer create(Indicator indicator);
	Integer createFromRest(Integer evaluationSheetId, String label);
	Indicator getById(Integer id);
}