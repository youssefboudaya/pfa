package evaluation.impl;

import java.sql.Date;
import java.text.SimpleDateFormat;
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
	public void create(EvaluationSheet evaluationSheet) {
		em.persist(evaluationSheet);	
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
	public void createFromRest(Integer subjectId, Integer creatorId, EvaluationType type, String createdAt,
			String availableUntil) {
		
		Utilisateur subject = userService.get(subjectId);
		Utilisateur creator = userService.get(creatorId);
		
		Date creationDate = Date.valueOf(createdAt);
		Date availableUntilDate = Date.valueOf(availableUntil);
		
		EvaluationSheet evaluationSheet = new EvaluationSheet(subject, creator, type, creationDate, availableUntilDate);
		
		em.persist(evaluationSheet);
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
}
