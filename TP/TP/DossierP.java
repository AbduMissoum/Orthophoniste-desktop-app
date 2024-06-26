package TP;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DossierP implements Serializable {

    protected int num_dossier;
    protected Patient patient;
    protected List<Rdv> rendezvousList;
    protected List<FicheDeSuivi> ficheSuiviList;
    protected String projetTherapeutique;
    protected FirstBO FirstBo;
    protected List<BO> BoList;

    // Constructeur
    public DossierP(Patient patient, int num) {
        this.patient = patient;
        this.rendezvousList = new ArrayList<>();
        this.ficheSuiviList = new ArrayList<>();
        this.BoList = new ArrayList<>();
        this.num_dossier = num;
    }

    // Méthodes pour ajouter des éléments aux listes
    public void ajouterRendezvous(Rdv rendezvous) {
        this.rendezvousList.add(rendezvous);
    }

    public void ajouterBO(BO Bo) {
        this.BoList.add(Bo);
    }

    public void ajouterFisrtBo(FirstBO FirstBO) {
        this.FirstBo = FirstBO;
    }

    public void ajouterFicheSuivi(FicheDeSuivi ficheSuivi) {
        this.ficheSuiviList.add(ficheSuivi);
    }

    public void setProjetTherapeutique(String projetTherapeutique) {
        this.projetTherapeutique = projetTherapeutique;
    }

    public Patient getPatient() {
        return patient;
    }

    public int getNumDossier() {
        return num_dossier;
    }

}