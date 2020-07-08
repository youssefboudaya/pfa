package tn.esprit.timesheet.services.interfaces;


import java.util.Date;
import java.util.List;

import javax.ejb.Remote;


import tn.esprit.timesheet.entities.*;


@Remote
public interface ExamenServiceRemote {
	
	public Apprenant getApprenantByEmailAndPassword(String login, String password);
	public List<Apprenant> getAllApprenants();
	public void ajouterApprenant(Apprenant employe);
	public void deleteApprenantById(int employeId);
	public void updateApprenant(Apprenant employe);
	public void ajouterCentre(Centre centre);
	public void affecterApprenantCentre(Integer idApprenant,Integer idCentre);
}
