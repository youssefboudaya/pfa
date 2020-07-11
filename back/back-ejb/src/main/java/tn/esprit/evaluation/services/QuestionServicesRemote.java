package tn.esprit.evaluation.services;

import javax.ejb.Remote;

import tn.esprit.evaluation.entities.Question;

@Remote
public interface QuestionServicesRemote {
	void create(Question question);
}
