package com.chiragproject.universalpetcare.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private String gender;
    @Column(name = "mobile")
    private String phoneNumber;
    private String email;
    private String password;
    private String userType;
    private boolean isEnable;

    @Transient
    private String specialization;
}
