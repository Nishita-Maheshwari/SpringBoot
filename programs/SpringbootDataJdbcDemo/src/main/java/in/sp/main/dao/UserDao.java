package in.sp.main.dao;

import org.springframework.data.repository.CrudRepository;

import in.sp.main.beans.User;

public interface UserDao extends CrudRepository<User, String>
{
	
}
