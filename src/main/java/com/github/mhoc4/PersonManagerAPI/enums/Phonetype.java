package com.github.mhoc4.PersonManagerAPI.enums;

public enum Phonetype {
    HOME("Home"),
    MOBILE("Mobile"),
    COMMERCIAL("Commercial");

    private final String description;

    Phonetype(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
