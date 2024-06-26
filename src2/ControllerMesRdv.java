import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ControllerMesRdv {

    @FXML
    private Button atelierBtn;

    @FXML
    private Button consultationBtn;

    @FXML
    private Button retour;

    @FXML
    private Button suiviBtn;

    @FXML
    private Label username;

    @FXML
    void mesAtelier(ActionEvent event) {

    }

    @FXML
    void mesConsultation(ActionEvent event) {

        FXMLLoader l = Main.h.changeScene("MesConsultation.fxml", event);
        ControllerMesConsultation controller = l.getController();
        controller.print();

    }

    @FXML
    void mesSuivi(ActionEvent event) {

        FXMLLoader l = Main.h.changeScene("s.fxml", event);
        ControllerMesSuivi controller = l.getController();
        controller.print();
        // }
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

}
