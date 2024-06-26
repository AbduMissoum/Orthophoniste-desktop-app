package TP;

public class Enfant extends Patient {
    protected String num_tel;
    protected String class_etude;
    private String dateDeNaissance;
    private String adresse;
    private String lieu;

    public Enfant(String class_etude, String num_tel, String nom, String prenom,
            int age,
            String dateDeNaissance, String adresse, String lieu) {
        super(nom, prenom, age);
        this.class_etude = class_etude;
        this.num_tel = num_tel;
        this.dateDeNaissance = dateDeNaissance;
        this.adresse = adresse;
        this.lieu = lieu;
    }

    public String getClassEtude() {
        return class_etude;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getLieu() {
        return lieu;
    }

    public String getTel() {
        return num_tel;
    }

    public String getDateDeNaissance()

    {
        return dateDeNaissance;
    }

}
