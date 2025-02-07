package com.example.lab02_02.datapostgres.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.lab02_02.datapostgres.data.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

