package com.example.wecon.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_authorization")
public class UserAuthorization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long authId;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    private User user;

    @Column(nullable = false)
    private String passwordHash;

}
