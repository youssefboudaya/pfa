package evaluation.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import evaluation.entities.Answer;
import evaluation.entities.EvaluationSheet;
import evaluation.entities.Question;
import evaluation.entities.Utilisateur;
import evaluation.services.AnswerServices;
import evaluation.services.AnswerServicesRemote;
import evaluation.services.QuestionServices;
import evaluation.services.UtilisateurServices;

@Stateless
@LocalBean
public class AnswerImpl implements AnswerServices, AnswerServicesRemote{
	
	@PersistenceContext(unitName= "primary")
	EntityManager em;

	@EJB
	QuestionServices questionServices;
	
	@EJB
	UtilisateurServices userServices;
	
	@Override
	public void respondeToQuestion(Answer answer) {
		em.persist(answer);
	}

	@Override
	public void noteAnAnswer(Answer answer, Integer note) {
		answer.setScore(note);
		
		em.persist(answer);
	}

	@Override
	public void respondeToQuestionFromRest(Integer employeeId, Integer questionId, String response) {
		Question question = questionServices.getById(questionId);
		Utilisateur employe = userServices.get(employeeId);
				
		Answer answer = new Answer(employe, question, response);
		
		em.persist(answer);
	}
	
	@Override
	public Answer getById(Integer id) {
		return em.find(Answer.class, id);
	}

	@Override
	public void noteAnAnswerFromRest(Integer answerId, Integer note) {
		Answer answer = this.getById(answerId);	
		
		this.noteAnAnswer(answer, note);
	}

	@Override
	public List<Answer> getUserAnswers(Integer userId) {
		Utilisateur user = userServices.get(userId);
		
		Query query = em.createQuery("select e from Answer e where e.employe =:userid").setParameter("userid", user); 
		return query.getResultList();		
	}
}