package com.example.wecon.entity;

import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Date;

@Data
@Table(name = "institution_reviews")
public class InstitutionReview {
    @OneToOne
    @Column(name = "institution_id")
    private Institution institution;
    @OneToOne
    @Column(name = "user_id")
    private User user;
    @Column(name = "review_date")
    private Date reviewDate;
    private int grade;
    private String comment;


}
