package in.sp.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sp.main.beans.Student;

public interface StudentDao extends JpaRepository<Student, Integer>
{

}
