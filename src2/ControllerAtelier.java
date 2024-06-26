import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import TP.Orthophoniste;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControllerAtelier {

    @FXML
    private Button ajouter;

    @FXML
    private Button annuler;

    @FXML
    private DatePicker date;

    @FXML
    private TextField dossierNum;

    @FXML
    private Label err;

    @FXML
    private TextField hourMin;

    @FXML
    private TextField thematique;

    @FXML
    void ajouterAtelier(ActionEvent event) {
        try {
            String atelierThematique = thematique.getText();
            String[] dossierList = dossierNum.getText().split(" ");
            List<Integer> l = new ArrayList<>();
            for (String s : dossierList)
                l.add(Integer.valueOf(s));
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
            o.programmer(rdvTime, l, atelierThematique);

            FXMLLoader scene = Main.h.changeScene("plannifier.fxml", event);
            ControllerPlannifier controller = scene.getController();
            controller.setPlannified("Une Atelier");
        } catch (Exception e) {
            setDispo();
        }

    }

    @FXML
    void retourPlannifier(ActionEvent event) {
        FXMLLoader l = Main.h.changeScene("plannifier.fxml", event);
    }

    public void setDispo() {
        err.setText("N'est pas disponible");
    }
}
