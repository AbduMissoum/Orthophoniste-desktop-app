import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ControllerMesPatient {

    @FXML
    private Button afficher;

    @FXML
    private Button ajouter;

    @FXML
    private Button retour;

    @FXML
    private Label username;
    @FXML
    private Label succuss;

    @FXML
    void afficherListePatient(ActionEvent event) {
        FXMLLoader l = Main.h.changeScene("afficherListPatient.fxml", event);
        ControllerListDesPatient controller = l.getController();
        controller.print();

    }

    @FXML
    void ajouterPatiient(ActionEvent event) {
        FXMLLoader l = Main.h.changeScene("AjouterPatient.fxml", event);
        // ControllerPlannifier controller = l.getController();
        // controller.setUsername();
    }

    @FXML
    void retourHello(ActionEvent event) {
        FXMLLoader l = Main.h.changeScene("Hello.fxml", event);
        ControllerHello controller = l.getController();
        controller.setUsername();
    }

    public void setUsername()

    {
        this.username.setText("Dr: " + Main.app.getOrthophoniste().getNom());
    }

    public void succussAddPatient(String type) {
        succuss.setText(type + " A été ajoutéé avec succes");
    }

}
