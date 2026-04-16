package com.chiragproject.universalpetcare.request;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class RegistrationRequest {
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
    private String specialization;
}
