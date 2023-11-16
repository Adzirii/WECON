package com.example.wecon.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserStatistics {

    @OneToOne()
    @Id
    @Column(name = "user_id")
    private User user;
    @Column(name = "step_count")
    private int stepCount;
    @Column(name = "promotions_count")
    private int promotionsCount;
    @Column(name = "completed_promotions_count")
    private int completedPromCount;





}
