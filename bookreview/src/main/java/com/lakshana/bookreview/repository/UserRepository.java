package com.lakshana.bookreview.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lakshana.bookreview.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

    
}
