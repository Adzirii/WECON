package com.example.wecon.entity;

import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "user_authorization")
public class UserAuthorization {
    @OneToOne
    @Column(name = "user_id")
    private User user;
    private String login;
    private String password;
}
