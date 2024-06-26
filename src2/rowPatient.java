import TP.Adulte;
import TP.DossierP;
import TP.*;
import javafx.scene.control.Button;

public class rowPatient {
    private String Nom;
    private String Prenom;
    private int NumDossier;
    private String type;
    private int Age;
    private Button learn;

    public rowPatient(DossierP p) {
        Nom = p.getPatient().getNom();
        Prenom = p.getPatient().getPrenom();
        NumDossier = p.getNumDossier();
        if (p.getPatient() instanceof Adulte)
            type = "Adulte";
        else
            type = "Enfant";
        learn = new Button("detail");
        Age = p.getPatient().getAge();

    }

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public int getAge() {
        return Age;
    }

    public Button getLearn() {
        return learn;
    }

    public int getNumDossier() {
        return NumDossier;
    }

    public String getType() {
        return type;
    }

}