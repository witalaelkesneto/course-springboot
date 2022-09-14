package com.eteg.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eteg.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
