package com.example.wecon.entity;

import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Date;

@Data
@Table(name = "promotion_data")
public class PromotionData {

    @OneToOne
    @Column(name = "promotion_id")
    private Promotion promotion;
    @Column(name = "start_date")
    private Date startDate;
    @Column(name = "end_date")
    private Date endDate;
    @Column(name = "views_count")
    private int viewsCount;
    @Column(name = "participants_count")
    private int participantsCount;

}
