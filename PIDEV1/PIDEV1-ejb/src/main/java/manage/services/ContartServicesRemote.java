package manage.services;

import java.util.List;

import javax.ejb.Remote;

import manage.entities.Contrat;

@Remote
public interface ContartServicesRemote {
	void create(Contrat contrat);
	Contrat get(Integer contratId);
	List<Contrat> getAll();
	
	void createFromRest(Integer userId, float salaire);
}
