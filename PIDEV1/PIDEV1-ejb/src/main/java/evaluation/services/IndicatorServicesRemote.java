package evaluation.services;

import javax.ejb.Remote;

import evaluation.entities.Indicator;

@Remote
public interface IndicatorServicesRemote {
	void create(Indicator indicator);
	void createFromRest(Integer evaluationSheetId, String label);
	Indicator getById(Integer id);
}
