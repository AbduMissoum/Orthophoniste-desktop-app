import TP.Adulte;
import TP.DossierP;
import TP.Enfant;
import TP.Orthophoniste;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControllerAjouterEnfant {

    @FXML
    private TextField adresse;

    @FXML
    private TextField age;

    @FXML
    private TextField dateDeNaissance;

    @FXML
    private TextField lieu;

    @FXML
    private TextField nom;

    @FXML
    private TextField prenom;

    @FXML
    private Button ajouter;

    @FXML
    private Button annuler;

    @FXML
    private TextField classeEtude;

    @FXML
    private TextField tel;

    @FXML
    void ajouterEnfant(ActionEvent event) {
        String Nom = nom.getText();
        String classe = classeEtude.getText();
        String Prenom = prenom.getText();
        String birthDate = dateDeNaissance.getText();
        String Lieu = lieu.getText();
        String Tel = tel.getText();
        String Adresse = adresse.getText();
        int Age = Integer.parseInt(age.getText());
        Enfant enfant = new Enfant(classe, Tel, Nom, Prenom, Age, birthDate, Adresse, Lieu);
        Orthophoniste o = Main.app.getOrthophoniste();
        DossierP dossier = new DossierP(enfant, o.getPatientList().size());
        o.getPatientList().add(dossier);
        FXMLLoader l = Main.h.changeScene("MesPatients.fxml", event);
        ControllerMesPatient controller = l.getController();
        controller.setUsername();
        controller.succussAddPatient("L'enfant");
    }

    @FXML
    void retourAjouterPatient(ActionEvent event) {
        FXMLLoader l = Main.h.changeScene("AjouterPatient.fxml", event);

    }

}
