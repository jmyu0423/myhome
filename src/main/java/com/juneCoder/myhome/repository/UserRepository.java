package com.juneCoder.myhome.repository;

import com.juneCoder.myhome.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
