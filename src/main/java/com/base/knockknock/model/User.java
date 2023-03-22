package com.base.knockknock.model;

import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;


@Entity
@Table(name = "user")
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @CreationTimestamp
    private LocalDateTime createdTime;
    @UpdateTimestamp
    private LocalDateTime lastUpdate;
    private String email;
    private String password;
    private Role role;

    public User (String name) {
        this.name = name;
    }

    public Long getId () {
        return id;
    }

    public String getName () {
        return name;
    }

    public LocalDateTime getCreatedTime () {
        return createdTime;
    }

    public LocalDateTime getLastUpdate () {
        return lastUpdate;
    }

    public String getEmail () {
        return email;
    }

    public String getPassword () {
        return password;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setEmail (String email) {
        this.email = email;
    }
}
