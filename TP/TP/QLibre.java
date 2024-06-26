package TP;

public class QLibre extends Question {
    protected String réponse;
    protected String[] motsClés;
    protected float coéff = 1;

    public QLibre(String réponse, String[] motsClés, float coéff) {
        this.réponse = réponse;
        this.motsClés = motsClés;
        this.coéff = coéff;
    };

    @Override
    public float calculerScore() {
        int nbr_mot_clé = 0;
        for (String mot : motsClés) {
            if (réponse.contains(mot)) {
                nbr_mot_clé += 1;
            }
        }
        note = (nbr_mot_clé / motsClés.length) * coéff;
        return (nbr_mot_clé / motsClés.length) * coéff;

    }
}
