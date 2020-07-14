package evaluation.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import evaluation.entities.Utilisateur;
import evaluation.services.UtilisateurServices;
import evaluation.services.UtilisateurServicesRemote;

@Stateless
@LocalBean
public class UtilisateurImpl implements UtilisateurServices, UtilisateurServicesRemote {
	
	@PersistenceContext(unitName= "primary")
	EntityManager em;
	
	@Override
	public void create(Utilisateur utilisateur) {
		em.persist(utilisateur);
	}

	@Override
	public Utilisateur get(Integer utilisateurId) {
		return em.find(Utilisateur.class, utilisateurId);
	}
}
