import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import java.util.zip.CheckedOutputStream;

import TP.Orthophoniste;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControllerSuivi {

    @FXML
    private Label Dispo;

    @FXML
    private Button ajouter;

    @FXML
    private DatePicker date;

    @FXML
    private TextField hourMin;
    @FXML
    private ChoiceBox<String> deroulement;
    private String s[] = { "Online", "Presential" };
    @FXML
    private TextField numDossier;

    @FXML
    private Button retour;

    @FXML
    void ajouterSuivi(ActionEvent event) {
        try {
            int num = Integer.parseInt(numDossier.getText());
            String Deroulement = deroulement.getValue();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            String[] date1 = date.getValue().format(formatter).split("/");
            String[] date2 = hourMin.getText().split(":");
            int t[] = new int[3];
            for (int i = 0; i < 3; i++)
                t[i] = Integer.parseInt(date1[i]);
            LocalDateTime rdvTime = LocalDateTime.of(t[0], t[1], t[2],
                    Integer.parseInt(date2[0]),
                    Integer.parseInt(date2[1]));
            Orthophoniste o = Main.app.getOrthophoniste();
            o.programmer(rdvTime, num, (Deroulement == "Presential"), null);
            FXMLLoader l = Main.h.changeScene("plannifier.fxml", event);
            ControllerPlannifier controller = l.getController();
            controller.setPlannified("Suivi Rdv");
        } catch (Exception e) {
            Dispo.setText("N'est pas disponible ");
        }
    }

    @FXML
    void retourPlannifier(ActionEvent event) {
        FXMLLoader l = Main.h.changeScene("Plannifier.fxml", event);
        ControllerPlannifier controller = l.getController();
        controller.setUsername();
    }

    public void Ajout() {
        deroulement.getItems().addAll(s);
    }

}
