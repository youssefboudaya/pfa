package tn.esprit.evaluation.services;

import javax.ejb.Remote;

import tn.esprit.evaluation.entities.Answer;

@Remote
public interface AnswerServicesRemote {
	void respondeToQuestion(Answer answer);
	void noteAnAnswer(Answer answer, Integer note);
}
