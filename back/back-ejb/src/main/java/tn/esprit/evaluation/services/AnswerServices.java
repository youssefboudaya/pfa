package tn.esprit.evaluation.services;

import javax.ejb.Local;

import tn.esprit.evaluation.entities.Answer;

@Local
public interface AnswerServices {
	void respondeToQuestion(Answer answer);
	void noteAnAnswer(Answer answer, Integer note);
}
