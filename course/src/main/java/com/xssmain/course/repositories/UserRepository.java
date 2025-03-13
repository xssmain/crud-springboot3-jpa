package com.xssmain.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xssmain.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}