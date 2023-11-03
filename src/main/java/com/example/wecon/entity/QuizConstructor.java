package com.example.wecon.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "quiz_constructor")
@Entity
public class QuizConstructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "quiz_id")
    private Long quizId;
    @OneToOne
    private Promotion promotion_id;
    @Column(name = "quiz_data")
    private String quizData; // must be JSON
}
