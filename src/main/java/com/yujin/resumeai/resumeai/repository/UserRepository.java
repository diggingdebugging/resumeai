package com.yujin.resumeai.resumeai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yujin.resumeai.resumeai.model.User;

public interface  UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
