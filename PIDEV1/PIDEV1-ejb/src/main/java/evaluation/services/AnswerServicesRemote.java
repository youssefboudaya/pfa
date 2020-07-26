package evaluation.services;

import java.util.List;

import javax.ejb.Remote;

import evaluation.entities.Answer;

@Remote
public interface AnswerServicesRemote {
	void respondeToQuestion(Answer answer);
	void respondeToQuestionFromRest(Integer EmployeeId, Integer questionId, String response);
	void noteAnAnswer(Answer answer, Integer note);
	void noteAnAnswerFromRest(Integer answerId, Integer note);
	Answer getById(Integer id);
	List<Answer> getUserAnswers(Integer userId);
}