package com.example.wecon.entity;

import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

@Data
@Table(name = "institution_description")
public class InstitutionDescription {
    @OneToOne
    @Column(name = "institution_id")
    private Institution institution;
    private String name;
    private String description;
    private String location; //нужна отдельная таблица адрес
    @Column(name = "picture_url")
    private String picUrl;
    private Double rating;
}
