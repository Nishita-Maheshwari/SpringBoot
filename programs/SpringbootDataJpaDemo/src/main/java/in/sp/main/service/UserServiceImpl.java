package in.sp.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.main.beans.User;
import in.sp.main.dao.UserDao;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	UserDao userDao;
	
	@Override
	public boolean addUser(User user) 
	{
		boolean status = false;
		try
		{
			userDao.save(user);
			status = true;
		}
		catch(Exception e)
		{
			status = false;
			e.printStackTrace();
		}
		
		return status;
	}

	@Override
	public boolean deleteUser(int id)
	{
		boolean status = false;
		try
		{
			userDao.deleteById(id);
			status = true;
		}
		catch(Exception e)
		{
			status = false;
			e.printStackTrace();
		}
		
		return status;
	}
}
