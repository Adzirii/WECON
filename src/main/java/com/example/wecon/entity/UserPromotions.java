package com.example.wecon.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

@Table(name = "user_promotions")
public class UserPromotions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long promId;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    private User user;

    private boolean isActive;
}
