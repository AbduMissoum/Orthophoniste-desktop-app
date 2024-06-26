package TP;

import java.io.*;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.ExecutionException;

public class Orthophoniste implements Serializable {
    private String nom;
    private String prenom;
    private String tel;
    private String mail;
    private String password;
    private List<Rdv> rdvList;
    private Agenda agenda;
    private String adresse;
    private List<DossierP> dossierList;

    // Constructor
    public Orthophoniste(String nom, String prenom, String tel, String mail, String password, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.mail = mail;
        this.password = password;
        this.rdvList = new ArrayList<>();
        this.agenda = new Agenda();
        this.adresse = adresse;
        this.dossierList = new ArrayList<>();
    }

    // Getters and Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Rdv> getRdvList() {
        return rdvList;
    }

    public void setRdvList(List<Rdv> rdvList) {
        this.rdvList = rdvList;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<DossierP> getPatientList() {
        return dossierList;
    }

    public void setPatientList(List<DossierP> dossierLists) {
        this.dossierList = dossierLists;
    }

    public void programmer(String nom, String prenom,
            int age, LocalDateTime date) throws Exception {
        Consultation c = new Consultation(nom, prenom, age, date);
        if (this.agenda.isDispo(c)) {
            rdvList.add(c);
        } else
            throw new Exception("n'est pas disponible");

    }

    public void programmer(LocalDateTime date, int num_dossier,
            boolean derouement, FicheDeSuivi fiche_de_suivi) throws Exception {
        Suivi s = new Suivi("",
                date, num_dossier, derouement, fiche_de_suivi);

        if (this.agenda.isDispo(s)) {
            rdvList.add(s);
        } else
            throw new Exception("n\'est pas disponible");
    }

    public void programmer(LocalDateTime date, List<Integer> patients, String thematique)
            throws Exception {

        Atelier a = new Atelier(date, patients, thematique);
        if (this.agenda.isDispo(a)) {
            rdvList.add(a);
        } else
            throw new Exception("n\'est pas disponible");

    }
}
