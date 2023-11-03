package com.example.wecon.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "user_promotions")
public class UserPromotions {
    @Column(name = "promotion_id")
    private Promotion promotion;
    @Column(name = "user_id")
    private User user;
    private boolean status;
}
