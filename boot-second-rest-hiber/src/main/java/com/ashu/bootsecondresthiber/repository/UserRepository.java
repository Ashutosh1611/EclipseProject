package com.ashu.bootsecondresthiber.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashu.bootsecondresthiber.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
