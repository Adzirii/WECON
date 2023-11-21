package com.example.wecon.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(unique = true, nullable = false)
    //@Size(min = 5, message = "Username must be at least 5 characters long")
    private String username;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(unique = true, nullable = false)
    private String phoneNumber;

    @Column(name = "date_of_birth", nullable = false)
    private Date dateOfBirth;

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime registrationDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime lastLogin;

    private String name;

    private String surname;

    private int age;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private UserAuthorization userAuthorization;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private UserStatistics userStatistics;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private UserPromotions userPromotions;
}
