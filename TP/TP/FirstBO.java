
package TP;

public class FirstBO extends BO {
    protected Anamnèse anamnèse;
    protected EpreuvesCliniques[] epreuvesCliniques;

    public FirstBO(Anamnèse anamnèse, EpreuvesCliniques[] epreuvesCliniques) {
        this.anamnèse = anamnèse;
        this.epreuvesCliniques = epreuvesCliniques;
    }
}
