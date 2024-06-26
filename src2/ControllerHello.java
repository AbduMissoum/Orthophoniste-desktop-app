import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ControllerHello {

    @FXML
    private Button plannifierBtn;

    @FXML
    private Button rdvBtn;
    @FXML
    private Button mesPatient;
    @FXML
    public Label username;
    @FXML
    private Button monCompte;
    @FXML
    private Button retour;

    @FXML
    void monComptePage(ActionEvent event) {
        FXMLLoader l = Main.h.changeScene("MonCompte (1).fxml", event);
        ControllerMonCompte controllerMonCompte = l.getController();
        controllerMonCompte.set();
    }

    @FXML
    void retourLogin(ActionEvent event) {
        FXMLLoader l = Main.h.changeScene("Login.fxml", event);

    }

    @FXML
    void plannifierPage(ActionEvent event) {
        FXMLLoader l = Main.h.changeScene("Plannifier.fxml", event);
        ControllerPlannifier controller = l.getController();
        controller.setUsername();
    }

    @FXML
    void mesPatientPage(ActionEvent event) {
        FXMLLoader l = Main.h.changeScene("MesPatients.fxml", event);
        // ControllerPlannifier controller = l.getController();
        // controller.setUsername();
    }

    @FXML
    void rdvPage(ActionEvent event) {
        FXMLLoader l = Main.h.changeScene("MesRdv.fxml", event);
        ControllerMesRdv controller = l.getController();
        controller.setUsername();
    }

    public void setUsername() {
        username.setText(" Doctor : " + Main.app.getOrthophoniste().getNom());
    }

}
