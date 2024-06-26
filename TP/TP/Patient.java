package TP;

import java.io.Serializable;

public abstract class Patient implements Serializable {
    protected String nom;
    protected String prenom;
    protected int age;

    public Patient(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }
}
