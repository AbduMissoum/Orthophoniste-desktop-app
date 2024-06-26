import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.util.*;

public class ControllerPlannifier {

  @FXML
  private Button atelierBtn;

  @FXML
  private Button consultationBtn;

  @FXML
  private Button retour;
  @FXML
  private Label username;
  @FXML
  private Label plannified;
  @FXML
  private Button suiviBtn;

  @FXML
  void atelierPage(ActionEvent event) {
    Main.h.changeScene("Atelier.fxml", event);
  }

  @FXML
  void consultationPage(ActionEvent event) {
    Main.h.changeScene("Consultation.fxml", event);

  }

  @FXML
  void retourHello(ActionEvent event) {
    FXMLLoader l = Main.h.changeScene("Hello.fxml", event);
    ControllerHello controller = l.getController();
    controller.setUsername();

  }

  public void setUsername() {
    username.setText(" Doctor : " + Main.app.getOrthophoniste().getNom());
  }

  public void setPlannified(String type) {
    plannified.setText(type + " a été plannifieé avec succes");

  }

  @FXML
  void suiviPage(ActionEvent event) {
    FXMLLoader l = Main.h.changeScene("Suivi.fxml", event);
    ControllerSuivi controllerSuivi = l.getController();
    controllerSuivi.Ajout();

  }

}
