package com.sda.javawro27.hibernate.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

// POJO - Plain old java object
// - pola musza miec gettery i settery
// - pusty konstruktor

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table

public class Student {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String firstName;
        private String lastName;

        @Enumerated(value = EnumType.STRING)
        private Behaviour behaviour;
        private double height;
        private int age;

        private boolean alive; // nie isAlive
        // lombok jeśli wygeneruje metodę na podstawie pola isAlive, to nazywać się będzie "isIsAlive"
        // isAlive
    }
