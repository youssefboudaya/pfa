package manage.services;

import java.util.List;

import javax.ejb.Local;

import manage.entities.Contrat;

@Local
public interface ContratServices {
	void create(Contrat contrat);
	Contrat get(Integer contratId);
	List<Contrat> getAll();
	
	void createFromRest(Integer userId, float salaire);
}
