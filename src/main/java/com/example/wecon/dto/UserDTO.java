package com.example.wecon.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String username;
    private String email;
    private String phoneNumber;
    private Date dateOfBirth;
    private LocalDateTime registrationDate;
    private LocalDateTime lastLogin;
    private String name;
    private String surname;
    private int age;

}
