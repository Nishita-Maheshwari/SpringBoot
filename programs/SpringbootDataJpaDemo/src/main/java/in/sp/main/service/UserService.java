package in.sp.main.service;

import in.sp.main.beans.User;

public interface UserService 
{
	public boolean addUser(User user);
	public boolean deleteUser(int id);
}
