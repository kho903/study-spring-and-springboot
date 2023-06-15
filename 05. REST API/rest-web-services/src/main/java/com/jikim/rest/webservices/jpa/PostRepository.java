package com.jikim.rest.webservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jikim.rest.webservices.user.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
