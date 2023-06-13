package com.jikim.rest.webservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jikim.rest.webservices.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
