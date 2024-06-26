
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import TP.*;

public class ControllerAfficherEnfant {

  @FXML
  private Label adresse;

  @FXML
  private Label classe;

  @FXML
  private Label dateDeNaissance;

  @FXML
  private Label lieu;

  @FXML
  private Label nom;

  @FXML
  private Label prenom;

  @FXML
  private Button retour;

  @FXML
  private Label tel;

  public void set(Patient p) {
    nom.setText(nom.getText() + " " + ((Enfant) p).getNom());
    prenom.setText(nom.getText() + " " + ((Enfant) p).getPrenom());
    tel.setText(nom.getText() + " " + ((Enfant) p).getTel());
    adresse.setText(adresse.getText() + " " + ((Enfant) p).getAdresse());
    dateDeNaissance.setText(nom.getText() + " " + ((Enfant) p).getDateDeNaissance());
    classe.setText(nom.getText() + " " + ((Enfant) p).getClass());
    lieu.setText(lieu.getText() + " " + ((Enfant) p).getLieu());

  }

  @FXML
  void retourMesPatient(ActionEvent event) {
    FXMLLoader l = Main.h.changeScene("afficherListPatient.fxml", event);
    ControllerListDesPatient controller = l.getController();
    controller.print();
  }

}
