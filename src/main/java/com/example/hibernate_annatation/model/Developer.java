package com.example.hibernate_annatation.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "HIBERNATE_DEVELOPERS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Developer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "SPECIALTY")
    private String specialty;
    @Column(name = "EXPERIENCE")
    private int experience;

    public Developer(String firstName, String lastName, String specialty, int experience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.experience = experience;
    }



}