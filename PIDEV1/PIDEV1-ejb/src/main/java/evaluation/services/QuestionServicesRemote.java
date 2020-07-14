package evaluation.services;

import javax.ejb.Remote;

import evaluation.entities.Question;

@Remote
public interface QuestionServicesRemote {
	void create(Question question);
	void createFromRest(Integer indicatorId, String question);
	Question getById(Integer id);
}