package com.example.lab02_02.datapostgres.data.entity;

import com.example.lab02_02.datapostgres.data.dto.UserDto;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public User() {
    }

    public User(UserDto userDto) {
        this.name = userDto.getName();
        this.email = userDto.getEmail();
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

