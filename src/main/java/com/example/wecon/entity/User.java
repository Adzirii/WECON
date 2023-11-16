package com.example.wecon.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "second_name")
    private String lastName;
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    private int age;
    private String email;
    @Column(name = "phone_number")
    private String phoneNumber;

}
