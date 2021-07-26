package com.github.mhoc4.PersonManagerAPI.entity;

import com.github.mhoc4.PersonManagerAPI.enums.Phonetype;

import javax.persistence.*;

@Entity
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Phonetype type;

    @Column(nullable = false)
    private String number;

    public Phone() {
    }

    public Phone(Long id, Phonetype type, String number) {
        this.id = id;
        this.type = type;
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Phonetype getType() {
        return type;
    }

    public void setType(Phonetype type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
