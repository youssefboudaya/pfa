package evaluation.services;

import javax.ejb.Local;

import evaluation.entities.Utilisateur;

@Local
public interface UtilisateurServices {
	void create(Utilisateur utilisateur);
	Utilisateur get(Integer utilisateurId);
}
