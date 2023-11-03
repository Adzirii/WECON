package com.example.wecon.entity;

import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "promotion_description")
public class PromotionDescription {
    @OneToOne
    @Column(name = "promotion_id")
    private Promotion promotion;
    private String name;
    private String description;
    @Column(name = "win_condition")
    private String winCondition;
    @Column(name = "prize_description")
    private String prizeDescription;
    @Column(name = "pic_url")
    private String picUrl;
}
