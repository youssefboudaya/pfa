package pidev;

import java.util.List;

import javax.ejb.Local;

import entities.User;

@Local
public interface UserServiceLocal {
	public User create(User user);
	public User read(long user_id);
	public User update(User user);
	public boolean delete(User user);
	public List<User> getAll();
}
