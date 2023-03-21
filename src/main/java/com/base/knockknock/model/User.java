package com.base.knockknock.model;

import lombok.NoArgsConstructor;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.joda.time.LocalDateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "user")
@NoArgsConstructor
public class User {
    public User (String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @CreatedDate
    @Generated(GenerationTime.INSERT)
    private LocalDateTime createdTime;
    @LastModifiedDate
    @Generated(GenerationTime.ALWAYS)
    private LocalDateTime lastUpdate;
}
