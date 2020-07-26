package evaluation.services;

import javax.ejb.Remote;

import evaluation.entities.Indicator;

@Remote
public interface IndicatorServicesRemote {
	Integer create(Indicator indicator);
	Integer createFromRest(Integer evaluationSheetId, String label);
	Indicator getById(Integer id);
}
