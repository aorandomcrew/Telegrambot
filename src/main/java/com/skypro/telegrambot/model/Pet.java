package com.skypro.telegrambot.model;

import jakarta.persistence.*;


@Entity(name = "pet")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "type")
    private String type;

    @Column(name = "status")
    private String status;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "shelter_id")
    private Shelter shelter_id;

}
