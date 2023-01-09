package com.k8.tutorial.k8_tutorial_mysql.ping.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
@Setter
@Getter
public class Ping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true)
    private LocalDateTime dataInicio = LocalDateTime.now();

    @Column(nullable = true)
    private String insertedBy;



    @Column(nullable = true)
    private int age;

    public Ping(String insertedBy) {
        this.insertedBy = insertedBy;
        age = LocalDateTime.now().getMinute();
    }

    public Ping() {
    }
}
