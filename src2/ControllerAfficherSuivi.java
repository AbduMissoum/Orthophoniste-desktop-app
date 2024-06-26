import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import TP.*;

public class ControllerAfficherSuivi {

    @FXML
    private Label date;

    @FXML
    private Label deroulement;

    @FXML
    private Label numDossier;

    @FXML
    private Label observation;

    @FXML
    private Button retour;

    public void set(Rdv rdv) {
        numDossier.setText(numDossier.getText() + " " + ((Suivi) rdv).getNumDossier());
        deroulement.setText(deroulement.getText() + " " + ((Suivi) rdv).getDeroulement());
        date.setText(date.getText() + " " + ((Suivi) rdv).getDate().toString());

    }

    @FXML
    void retourMesSuivi(ActionEvent event) {
        FXMLLoader l = Main.h.changeScene("MesSuivi.fxml", event);
        ControllerMesSuivi controller = l.getController();
        controller.print();
    }

}
