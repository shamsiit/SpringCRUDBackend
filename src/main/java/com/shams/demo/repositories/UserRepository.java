package com.shams.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shams.demo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
