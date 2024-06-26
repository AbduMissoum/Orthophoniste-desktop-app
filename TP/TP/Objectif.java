package TP;

import java.io.Serializable;

public class Objectif implements Serializable {
    private String nom;
    private Terme terme;
    private boolean atteint;
    private int note;

    public Objectif(String nom, Terme terme, boolean atteint, int note) {
        this.nom = nom;
        this.terme = terme;
        this.atteint = atteint;
        this.note = note;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Terme getTerme() {
        return terme;
    }

    public void setTerme(Terme terme) {
        this.terme = terme;
    }

    public boolean isAtteint() {
        return atteint;
    }

    public void setAtteint(boolean atteint) {
        this.atteint = atteint;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    // Additional methods if needed
    public enum Terme {
        COURT, MOYEN, LONG;
    }
}