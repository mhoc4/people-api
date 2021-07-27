package com.github.mhoc4.PersonManagerAPI.dto;

import com.github.mhoc4.PersonManagerAPI.enums.Phonetype;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class PhoneDTO {

    private Long id;

    @Enumerated(EnumType.STRING)
    private Phonetype type;

    @NotEmpty
    @Size(min = 13, max = 14)
    private String number;

    public PhoneDTO() {
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
