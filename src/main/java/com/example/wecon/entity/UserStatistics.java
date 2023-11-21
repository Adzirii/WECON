package com.example.wecon.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserStatistics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long statId;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    private User user;



    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime lastLogin;


    private int totalLogins;
    private int stepCount;
    private int promotionsCount;
    private int completedPromCount;
}
