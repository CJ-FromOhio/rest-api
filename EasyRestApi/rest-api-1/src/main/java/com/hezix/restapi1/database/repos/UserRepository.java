package com.hezix.restapi1.database.repos;

import com.hezix.restapi1.database.dto.UserCreateUpdateDto;
import com.hezix.restapi1.database.dto.UserReadDto;
import com.hezix.restapi1.database.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.username = :username")
    Optional<User> findByUsername(@Param("username") String username);

}
