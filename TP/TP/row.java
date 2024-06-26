package TP;

import java.time.*;
import javafx.scene.control.Button;

public class row {
    private String nom;
    private String prenom;
    private String statut;
    private int age;
    private LocalDateTime date;
    private String type;
    private Button learn;

    public row(Rdv rdv) {
        nom = ((Consultation) rdv).getNom();
        prenom = ((Consultation) rdv).getPrenom();
        age = ((Consultation) rdv).getAge();
        date = ((Consultation) rdv).getDate();
        type = (((Consultation) rdv).getType() == true) ? "Adulte" : "Enfant";
        learn = new Button("details");
    }

    public String getType() {
        return this.type;
    }

    public Button getLearn() {
        return this.learn;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return this.age;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public LocalDateTime getDate() {
        return this.date;
    }

}