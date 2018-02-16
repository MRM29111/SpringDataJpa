package ua.online.courses.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ua.online.courses.entity.Course;
import ua.online.courses.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	

}
