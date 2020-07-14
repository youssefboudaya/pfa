package evaluation.services;

import javax.ejb.Local;

import evaluation.entities.Answer;

@Local
public interface AnswerServices {
	void respondeToQuestion(Answer answer);
	void respondeToQuestionFromRest(Integer EmployeeId, Integer questionId, String response);
	void noteAnAnswer(Answer answer, Integer note);
	void noteAnAnswerFromRest(Integer answerId, Integer note);
	Answer getById(Integer id);
}
