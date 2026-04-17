package com.chiragproject.universalpetcare.request;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class UserUpdateRequest {
    private String firstname;
    private String lastname;
    private String gender;
    private String phoneNumber;
    private String specialization;
}
