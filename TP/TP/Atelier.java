package TP;

import java.time.*;
import java.util.*;

public class Atelier extends Rdv {
    private List<Integer> patients;
    private String thematique;
    final int duree = 60;

    Atelier(
            LocalDateTime date,
            List<Integer> patients,
            String thematique) {
        this.date = date;
        this.patients = patients;
        this.thematique = thematique;
    }

    public int getDuree() {
        return this.duree;
    }

    // Getters and Setters
}
