package services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.User;
import pidev.UserServiceLocal;
import pidev.UserServiceRemote;
@Stateless
 public class UserService implements UserServiceRemote,UserServiceLocal {

	@PersistenceContext(unitName= "primary")
	EntityManager em;
	@Override
	public User create(User user) {
		em.persist(user);
		return em.merge(user);
	}

	@Override
	public User read(long user_id) {
		return em.find(User.class, user_id);
	}

	@Override
	public User update(User user) {
		return em.merge(user);
	}

	@Override
	public boolean delete(User user) {
		em.remove(user);
		return em.contains(user);
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return em.createQuery("from user").getResultList();
	}

}
