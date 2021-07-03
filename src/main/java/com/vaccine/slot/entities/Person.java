package com.vaccine.slot.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long personId;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    private Gender gender;

    @Column
    private boolean isWorkingProfessional;
}
