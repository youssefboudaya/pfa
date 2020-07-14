package services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Mission;
import entities.User;
import pidev.MissionServiceLocal;
import pidev.MissionServiceRemote;

@Stateless
public class MissionService implements MissionServiceLocal,MissionServiceRemote {
	@PersistenceContext(unitName= "primary")
	EntityManager em;
	@Override
	public Mission create(Mission mission) {
		// TODO Auto-generated method stub
		em.persist(mission);
		return em.merge(mission);
	}

	
	@Override
	public Mission read(Long mission_id) {
		return em.find(Mission.class, mission_id);
	}

	@Override
	public Mission update(Mission mission) {
		return em.merge(mission);
	}

	@Override
	public boolean delete(Mission mission) {
		em.remove(mission);
		return em.contains(mission);
	}

	@Override
	public List<Mission> getAll() {
		// TODO Auto-generated method stub
		return  em.createQuery("from mission").getResultList();
	}


	@Override
	public List<Mission> getAllByUser(Long user_id) {
		// TODO Auto-generated method stub
		User u = em.find(User.class, user_id);
		if(u!=null)
		return  em.createQuery("from mission where user:u",Mission.class).getResultList();
		
		return new ArrayList<Mission>();
	}


}
