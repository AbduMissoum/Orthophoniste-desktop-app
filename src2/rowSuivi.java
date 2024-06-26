
import java.time.*;

import TP.Rdv;
import TP.Suivi;
import javafx.scene.control.Button;

public class rowSuivi {
    private int numDossier;
    private LocalDateTime date;
    private String deroulement;
    private Button learn;

    public rowSuivi(Rdv rdv) {
        numDossier = ((Suivi) rdv).getNumDossier();
        deroulement = ((Suivi) rdv).getDeroulement();
        date = ((Suivi) rdv).getDate();
        learn = new Button("Details");
    }

    public int getNumDossier() {
        return numDossier;
    }

    public String getDeroulement() {
        return deroulement;
    }

    public Button getLearn() {
        return learn;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
