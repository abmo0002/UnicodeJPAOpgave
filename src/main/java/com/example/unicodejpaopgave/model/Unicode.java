package com.example.unicodejpaopgave.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Unicode {

    @Id
    private int unicode;
    private char bogstav;
    private String description;
    private String name;

    public Unicode() {
    }


    public int getUnicode() {
        return unicode;
    }

    public void setUnicode(int unicode) {
        this.unicode = unicode;
    }

    public char getBogstav() {
        return bogstav;
    }

    public void setBogstav(char bogstav) {
        this.bogstav = bogstav;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}