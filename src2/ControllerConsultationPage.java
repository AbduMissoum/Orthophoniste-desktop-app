import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import TP.*;

public class ControllerConsultationPage {

    @FXML
    private Label age;

    @FXML
    private Label date;

    @FXML
    private Button modifier;

    @FXML
    private Label nom;

    @FXML
    private Label observation;

    @FXML
    private Label prenom;
    @FXML
    private Label type;

    @FXML
    private Button retourBtn;

    @FXML
    void modifierConsultation(ActionEvent event) {

    }

    @FXML
    void retourMesConsultation(ActionEvent event) {
        FXMLLoader l = Main.h.changeScene("MesConsultation.fxml", event);
        ControllerMesConsultation controller = l.getController();
        controller.print();
    }

    public void setData(Rdv rdv) {
        nom.setText("Nom: " + ((Consultation) rdv).getNom());
        prenom.setText("Prenom: " + ((Consultation) rdv).getPrenom());
        age.setText("Age: " + String.valueOf(((Consultation) rdv).getAge()));
        date.setText("Date: " + ((Consultation) rdv).getDate().toString());
        type.setText("Adulte/Enfant: " + (((Consultation) rdv).getAge() >= 18 ? "Adulte" : "Enfant"));
        observation.setText("Observation: " + rdv.getObservation());
    }
}
