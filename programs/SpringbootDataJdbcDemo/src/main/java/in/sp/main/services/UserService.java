package in.sp.main.services;

import java.util.List;

import in.sp.main.beans.User;

public interface UserService
{
	public boolean addUser(User user);
	public boolean updateUser(User user);
	public boolean deleteUser(String email);
	public User searchUser(String email);
	public List<User> getAllUsers();
}
