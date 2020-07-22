package manage.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import evaluation.entities.EvaluationSheet;
import evaluation.entities.Utilisateur;
import evaluation.services.UtilisateurServices;
import manage.entities.Contrat;
import manage.services.ContartServicesRemote;
import manage.services.ContratServices;

@Stateless
@LocalBean
public class ContratImpl implements ContratServices, ContartServicesRemote {
	@PersistenceContext(unitName= "primary")
	EntityManager em;
	
	@EJB
	UtilisateurServices userService;

	@Override
	public void create(Contrat contrat) {
		em.persist(contrat);		
	}

	@Override
	public Contrat get(Integer contratId) {
		return em.find(Contrat.class, contratId);
	}

	@Override
	public void createFromRest(Integer userId, float salaire) {
		Utilisateur user = userService.get(userId);		
		Contrat contrat = new Contrat(salaire, user);
		
		em.persist(contrat);
	}

	@Override
	public List<Contrat> getAll() {
		Query query = em.createQuery("select c from Contrat c"); 
		return query.getResultList();
	}
}
