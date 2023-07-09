package in.sp.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sp.main.beans.User;

public interface UserDao extends JpaRepository<User, Integer>
{
	
}
