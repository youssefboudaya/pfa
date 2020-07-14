package services;

import java.util.ArrayList;
import java.util.List;

import entities.User;

public interface IUserService {
	public User create(User user);
	public User read(Long user_id);
	public User update(User user);
	public boolean delete(User user);
	public List<User> getAll();
}
