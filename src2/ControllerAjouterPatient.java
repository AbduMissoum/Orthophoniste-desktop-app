import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class ControllerAjouterPatient {

    @FXML
    private Button adulte;

    @FXML
    private Button enfant;

    @FXML
    private Button retour;

    @FXML
    private Label username;

    @FXML
    void ajouterAdultePage(ActionEvent event) {
        FXMLLoader l = Main.h.changeScene("FormAdulte.fxml", event);

    }

    @FXML
    void ajouterEnfantPage(ActionEvent event) {
        FXMLLoader l = Main.h.changeScene("FormEnfant.fxml", event);

    }

    @FXML
    void retourMesPatient(ActionEvent event) {
        FXMLLoader l = Main.h.changeScene("MesPatients.fxml", event);
        ControllerMesPatient controller = l.getController();
        controller.setUsername();
    }

    public void setUsername()

    {
        this.username.setText("Dr" + Main.app.getOrthophoniste().getNom());
    }

}
