package com.example.wecon.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@Table(name = "client_users")
public class ClientUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_user_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", unique = true)
    private User user;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "clientUser")
//    private List<Institution> institutions;

    private String taxId;

}
