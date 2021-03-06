package evaluation.impl;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import evaluation.entities.EvaluationDecision;
import evaluation.entities.EvaluationSheet;
import evaluation.entities.EvaluationType;
import evaluation.entities.Utilisateur;
import evaluation.services.EvaluationSheetServices;
import evaluation.services.EvaluationSheetServicesRemote;
import evaluation.services.UtilisateurServices;
import services.UserService;

@Stateless
@LocalBean
public class EvaluationSheetImpl implements EvaluationSheetServices, EvaluationSheetServicesRemote{
	
	@PersistenceContext(unitName= "primary")
	EntityManager em;
	
	@EJB
	UtilisateurServices userService;

	@Override
	public Integer create(EvaluationSheet evaluationSheet) {
		em.persist(evaluationSheet);
		em.flush();
		
		return evaluationSheet.getId();
	}

	@Override
	public void commentOnEvaluationSheet(EvaluationSheet evaluationSheet, String comment) {
		evaluationSheet.setComment(comment);
		em.persist(evaluationSheet);
	}

	@Override
	public void takeDecision(EvaluationSheet evaluationSheet, EvaluationDecision decision) {
		evaluationSheet.setDecision(decision);
		em.persist(evaluationSheet);
	}

	@Override
	public List<EvaluationSheet> get() {
		Query query = em.createQuery("select e from EvaluationSheet e") ; 
		return query.getResultList();
	}

	@Override
	public Integer createFromRest(Integer subjectId, Integer creatorId, EvaluationType type, String createdAt,
			String availableUntil) {
		
		Utilisateur subject = userService.get(subjectId);
		Utilisateur creator = userService.get(creatorId);
		
		Date creationDate = Date.valueOf(createdAt);
		Date availableUntilDate = Date.valueOf(availableUntil);
		
		EvaluationSheet evaluationSheet = new EvaluationSheet(subject, creator, type, creationDate, availableUntilDate);
		
		return this.create(evaluationSheet);
	}

	@Override
	public EvaluationSheet getById(Integer evaluationSheetId) {
		return em.find(EvaluationSheet.class, evaluationSheetId);
	}

	@Override
	public void commentOnEvaluationSheetFromRest(Integer evaluationSheetId, String comment) {
		EvaluationSheet evaluationSheet = this.getById(evaluationSheetId);
		
		this.commentOnEvaluationSheet(evaluationSheet, comment);
	}

	@Override
	public void takeDecisionFromRest(Integer evaluationSheetId, String evlDecision) {
		EvaluationSheet evaluationSheet = this.getById(evaluationSheetId);
		
		EvaluationDecision decision;
		
		if(evlDecision.equals("PROMOTION"))
		{
			 	decision = EvaluationDecision.PROMOTION;
		} 
			else if(evlDecision.equals("AUGMENTATION"))
		{
				decision = EvaluationDecision.AUGMENTATION;
		} 
			else if (evlDecision.equals("PRIME"))
		{
				decision = EvaluationDecision.PRIME;
		} 
			else {
				decision = EvaluationDecision.RIEN;
		}
		
		this.takeDecision(evaluationSheet, decision);
	}

	@Override
	public List<EvaluationSheet> getUserEvaluationSheets(String email) {		
			Utilisateur user = userService.getByEmail(email);
		
			Query query = em.createQuery("select e from EvaluationSheet e where e.subject =:userid or e.creator =:userid").setParameter("userid", user); 
			return query.getResultList();		
	}

	@Override
	public Utilisateur getUser(String email) {
		return userService.getByEmail(email);
	}

	@Override
	public List<Utilisateur> getAllUsers() {
		Query query = em.createQuery("select u from Utilisateur u");
		return query.getResultList();
	}
}
