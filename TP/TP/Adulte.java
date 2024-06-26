package TP;

public class Adulte extends Patient {
    private String diplome;
    private String profession;
    private String num_perso;// ask abt it
    private String dateDeNaissance;
    private String adresse;
    private String lieu;

    public Adulte(String diplome, String dateDeNaissance, String prefession, String num_perso, String nom,
            String prenom, int age, String adresse, String lieu) {
        super(nom, prenom, age);
        this.profession = prefession;
        this.num_perso = num_perso;
        this.diplome = diplome;
        this.dateDeNaissance = dateDeNaissance;
        this.adresse = adresse;
        this.lieu = lieu;

    }

    public String getLieu() {
        return lieu;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getDiplome() {
        return diplome;
    }

    public String getNumTel() {
        return num_perso;
    }

    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    public String getProffesion() {
        return profession;
    }
}
