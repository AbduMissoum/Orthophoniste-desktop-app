import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import TP.*;

public class ControllerAfficherAdult {

    @FXML
    private Label adresse;

    @FXML
    private Label dateDeNaissance;

    @FXML
    private Label diplome;

    @FXML
    private Label lieu;

    @FXML
    private Label nom;

    @FXML
    private Label prenom;

    @FXML
    private Label profession;

    @FXML
    private Button retour;

    @FXML
    private Label tel;

    @FXML
    void retourListPatient(ActionEvent event) {
        FXMLLoader l = Main.h.changeScene("afficherListPatient.fxml", event);
        ControllerListDesPatient controller = l.getController();
        controller.print();
    }

    public void set(Patient p) {
        nom.setText(nom.getText() + " " + ((Adulte) p).getNom());
        prenom.setText(nom.getText() + " " + ((Adulte) p).getPrenom());
        tel.setText(nom.getText() + " " + ((Adulte) p).getNumTel());
        adresse.setText(adresse.getText() + " " + ((Adulte) p).getAdresse());
        dateDeNaissance.setText(nom.getText() + " " + ((Adulte) p).getDateDeNaissance());
        profession.setText(nom.getText() + " " + ((Adulte) p).getProffesion());
        lieu.setText(lieu.getText() + " " + ((Adulte) p).getLieu());

    }

}
