package com.filemesh.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="user", indexes = {
@Index(name = "fn_email", columnList="email")
})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(length = 40)
    private String firstName;

    @Column(length = 20)
    private String lastName;

    @Column(length = 60,nullable = false, unique = true)
    private String email;

    private boolean emailVerified;
}
