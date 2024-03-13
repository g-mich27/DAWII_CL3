package com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Model.User;
import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Service.UserCategoryProjection;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	@Query("SELECT u FROM User u WHERE u.name LIKE %?1%")
    List<User> findByName(String name);
	

	@Query("SELECT c.name AS categoryName, COUNT(u.userId) AS userCount " +
		       "FROM Ticket t " +
		       "JOIN Category c ON t.category.categoryId = c.categoryId " +
		       "JOIN User u ON t.user.userId = u.userId " +
		       "GROUP BY c.categoryId, c.name")
    List<UserCategoryProjection> getUsersByCategory();
	
	public User findByUserName(String username);
}
