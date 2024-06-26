package TP;

import java.time.*;

import java.util.*;

public class Suivi extends Rdv {
    public int num_dossier;
    public boolean deroulement;// 0 en ligne 1 presential
    public final int duree = 60;// 1h
    public FicheDeSuivi fiche_de_suivi;

    public Suivi(String observation, LocalDateTime date, int num_dossier, boolean deroulement,
            FicheDeSuivi fiche_de_suivi) {

        this.num_dossier = num_dossier;
        this.deroulement = deroulement;
        this.fiche_de_suivi = fiche_de_suivi;
        this.date = date;
    }

    public int getDuree() {
        return this.duree;
    }

    public int getNumDossier() {
        return num_dossier;
    }

    public String getDeroulement() {
        return (deroulement) ? "Presential" : "Online";
    }

    public FicheDeSuivi getFicheDeSuivi() {
        return fiche_de_suivi;
    }

    // Getters and Setters
}
