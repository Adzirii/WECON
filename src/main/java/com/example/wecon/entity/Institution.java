package com.example.wecon.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "institutions")
public class Institution {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "institution_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_user_id")
    private ClientUser clientUser;

}
