
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import TP.*;

public class ControllerAjouterAdulte {

    @FXML
    private TextField adresse;

    @FXML
    private Button ajouter;

    @FXML
    private Button annuler;

    @FXML
    private TextField dateDeNaissance;

    @FXML
    private TextField diplome;

    @FXML
    private TextField lieu;

    @FXML
    private TextField nom;

    @FXML
    private TextField num_tel;

    @FXML
    private TextField prenom;
    @FXML
    private TextField age;

    @FXML
    private TextField profession;

    @FXML
    void ajouterAdulte(ActionEvent event) {
        String Nom = nom.getText();
        String Prenom = prenom.getText();
        String birthDate = dateDeNaissance.getText();
        String Lieu = lieu.getText();
        String Diplome = diplome.getText();
        String Tel = num_tel.getText();

        String Adresse = adresse.getText();
        String Profession = profession.getText();
        int Age = Integer.parseInt(age.getText());
        Adulte adulte = new Adulte(Diplome, birthDate,
                Profession, Profession, Nom, Prenom, Age, Adresse, Lieu);
        Orthophoniste o = Main.app.getOrthophoniste();
        DossierP dossier = new DossierP(adulte, o.getPatientList().size());
        o.getPatientList().add(dossier);
        FXMLLoader l = Main.h.changeScene("MesPatients.fxml", event);
        ControllerMesPatient controller = l.getController();
        controller.setUsername();
        controller.succussAddPatient("l'Adulte");
    }

    @FXML
    void retourAjouterPatient(ActionEvent event) {
        FXMLLoader l = Main.h.changeScene("AjouterPatient.fxml", event);

    }

}
