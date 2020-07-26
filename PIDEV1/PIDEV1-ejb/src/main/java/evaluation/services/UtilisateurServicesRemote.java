package evaluation.services;

import javax.ejb.Remote;

import evaluation.entities.Utilisateur;

@Remote
public interface UtilisateurServicesRemote {
	void create(Utilisateur utilisateur);
	Utilisateur get(Integer utilisateurId);
	Utilisateur getByEmail(String email);
}
