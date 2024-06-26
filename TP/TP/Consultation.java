package TP;

import java.time.*;
import java.util.*;

public class Consultation extends Rdv {
    private String nom;
    private String prenom;

    private int age;
    private int duree;
    private boolean type;// 0 enfant 1 adulte

    public String getNom() {
        return nom;
    }

    Consultation(String nom, String prenom, int age, LocalDateTime date) {
        this.nom = nom;
        this.age = age;
        this.prenom = prenom;
        this.type = (age > 18);// true-->adulte ,false-->enfant
        this.setDurre();
        this.date = date;
        this.observation = "";
    }

    public boolean getType() {
        return this.type;
    }

    public void setDurre() {
        duree = (this.type == false) ? 90 : 150;
    }

    public int getDuree() {
        return this.duree;// in minutes
    }

    public int getAge() {
        return this.age;
    }

    public String getPrenom() {
        return this.prenom;
    }

    // Getters and Setters
}