/**
 * Copyright (C) 2006-2017  AdMaster Co.Ltd.
 * All right reserved.
 */

package com.example.jwt.repository;

import com.example.jwt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
