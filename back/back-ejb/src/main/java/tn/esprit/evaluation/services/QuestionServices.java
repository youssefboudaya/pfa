package tn.esprit.evaluation.services;

import javax.ejb.Local;

import tn.esprit.evaluation.entities.Question;

@Local
public interface QuestionServices {
	void create(Question question);
}
