import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import TP.*;
import TP.Orthophoniste;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.DragEvent;

public class ControllerConsultation {

    @FXML
    private TextField age;

    @FXML
    private Button ajouter;

    @FXML
    private DatePicker date;

    @FXML
    private TextField hourMin;
    @FXML
    private Label Dispo;

    @FXML
    private TextField nom;

    @FXML
    private TextField prenom;

    @FXML
    private Button retour;

    @FXML
    void ajouterConsultation(ActionEvent event) {
        try {
            String Nom = nom.getText();
            String Prenom = prenom.getText();
            int Age = Integer.parseInt(age.getText());
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
            System.out.println(rdvTime);

            o.programmer(Nom, Prenom, Age, rdvTime);

            FXMLLoader l = Main.h.changeScene("plannifier.fxml", event);
            ControllerPlannifier controller = l.getController();
            controller.setPlannified("Consultation");
        } catch (Exception e) {
            setDispo();
        }

        // Create a formatter

    }

    @FXML
    void retourPlannifier(ActionEvent event) {
        FXMLLoader l = Main.h.changeScene("Plannifier.fxml", event);
        ControllerPlannifier controller = l.getController();
        controller.setUsername();
    }

    public void setDispo() {
        Dispo.setText("N'est pas disponible ");
    }

}
