package evaluation.services;

import javax.ejb.Local;

import evaluation.entities.Question;

@Local
public interface QuestionServices {
	void create(Question question);
	void createFromRest(Integer indicatorId, String question);
	Question getById(Integer id);
}