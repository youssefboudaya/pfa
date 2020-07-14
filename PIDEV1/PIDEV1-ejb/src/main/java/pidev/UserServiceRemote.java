package pidev;

import java.util.List;

import javax.ejb.Remote;


import entities.User;

@Remote
public interface UserServiceRemote {
	public User create(User user);
	public User read(long user_id);
	public User update(User user);
	public boolean delete(User user);
	public List<User> getAll();

}
