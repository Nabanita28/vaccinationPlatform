package com.vaccine.slot.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "Slot")
public class Slot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column
    private String time;

    @Column
    private List<String> timeOfVaccine;

    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "personId")
    private Person person;

    @Column
    private boolean isAvailable;

}
