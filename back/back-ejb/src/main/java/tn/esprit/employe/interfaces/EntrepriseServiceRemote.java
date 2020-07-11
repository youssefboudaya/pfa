package tn.esprit.employe.interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.employe.entities.Departement;
import tn.esprit.employe.entities.Entreprise;

@Remote
public interface EntrepriseServiceRemote {
	public int ajouterEntreprise(Entreprise entreprise);
	public int ajouterDepartement(Departement dep);
	void affecterDepartementAEntreprise(int depId, int entrepriseId);
	List<String> getAllDepartementsNamesByEntreprise(int entrepriseId);
	public void deleteEntrepriseById(int entrepriseId);
	public void deleteDepartementById(int depId);
	public Entreprise getEntrepriseById(int entrepriseId);
}
