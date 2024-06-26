
package TP;

import java.io.Serializable;

public class Exercice implements Serializable {
    protected float score;
    protected String consigne;
    protected String matériel;

    public Exercice(float score, String consigne, String matériel) {
        this.score = score;
        this.consigne = consigne;
        this.matériel = matériel;
    }

}
