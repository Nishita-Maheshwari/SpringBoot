package in.sp.main.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.sp.main.beans.User;
import in.sp.main.dao.UserDao;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	UserDao userDao;
	
	@Transactional
	@Override
	public boolean addUser(User user)
	{
		boolean status = false;
		
		try
		{
			User.is_new = true;
			User user1 = userDao.save(user);
			if(user1.getEmail().equals(user.getId()))
			{
				status = true;
			}
			else
			{
				status = false;
			}
		}
		catch(Exception e)
		{
			status = false;
			e.printStackTrace();
		}
		
		return status;
	}

	@Transactional
	@Override
	public boolean updateUser(User user)
	{
		boolean status = false;
		
		try
		{
			User.is_new = false;
			User user1 = userDao.save(user);
			if(user1.getEmail().equals(user.getId()))
			{
				status = true;
			}
			else
			{
				status = false;
			}
		}
		catch(Exception e)
		{
			status = false;
			e.printStackTrace();
		}
		
		return status;
	}

	@Transactional
	@Override
	public boolean deleteUser(String email)
	{
		boolean status = false;
		
		try
		{
			userDao.deleteById(email);
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
	public User searchUser(String email) 
	{
		User user=null;
		
		try
		{
			Optional<User> optional = userDao.findById(email);
			if(optional.isPresent())
			{
				user = optional.get();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return user;
	}

	@Override
	public List<User> getAllUsers() 
	{
		Iterable<User> iterable = userDao.findAll();
		
		List<User> list_users = new ArrayList<>();
		
		Iterator<User> itr = iterable.iterator();
		while(itr.hasNext())
		{
			User user = itr.next();
			list_users.add(user);
		}
		
		return list_users;
	}
}
