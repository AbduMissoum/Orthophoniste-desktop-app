import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Button;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import TP.*;

public class ControllerMesConsultation {
    @FXML
    private TableView<row> menu = new TableView<>();

    @FXML
    public void retourMesRdv(ActionEvent event) {
        FXMLLoader l = Main.h.changeScene("MesRdv.fxml", event);
        ControllerMesRdv controller = l.getController();
        controller.setUsername();
    }

    public void print() {

        List<row> rowList = new ArrayList<>();
        // Define the columns
        TableColumn<row, String> firstNameCol = new TableColumn<>("Nom");
        firstNameCol.setCellValueFactory(new PropertyValueFactory<>("nom"));

        TableColumn<row, String> lastNameCol = new TableColumn<>("Prenom");
        lastNameCol.setCellValueFactory(new PropertyValueFactory<>("prenom"));

        TableColumn<row, Integer> ageCol = new TableColumn<>("Age");
        ageCol.setCellValueFactory(new PropertyValueFactory<>("age"));
        TableColumn<row, LocalDateTime> timecol = new TableColumn<>("Date");
        timecol.setCellValueFactory(new PropertyValueFactory<>("date"));
        TableColumn<row, String> typeCol = new TableColumn<>("Adule/Enfant");
        typeCol.setCellValueFactory(new PropertyValueFactory<>("type"));
        // Add columns to the table
        TableColumn<row, Button> learncol = new TableColumn<>(" ");
        learncol.setCellValueFactory(new PropertyValueFactory<>("learn"));

        menu.getColumns().addAll(firstNameCol, lastNameCol, ageCol, timecol, typeCol, learncol);
        Orthophoniste o = Main.app.getOrthophoniste();
        for (Rdv rdv : o.getRdvList()) {
            if (rdv instanceof Consultation) {

                row r = new row(rdv);
                r.getLearn().setOnAction(e -> {
                    FXMLLoader l = Main.h.changeScene("AffichConsultation.fxml", e);
                    ControllerConsultationPage controller = l.getController();
                    controller.setData(rdv);
                });

                rowList.add(r);
            }
        }
        ObservableList<row> singleItemList = FXCollections.observableArrayList(rowList);

        // Set the items to the TableView
        menu.setItems(singleItemList);

    }

    // public void print() {
    // Orthophoniste o = Main.app.getOrthophoniste();
    // for (Rdv rdv : o.getRdvList()) {
    // Label l = new Label("");
    // if (rdv instanceof Consultation) {
    // String name = ((Consultation) rdv).getNom();
    // String fullname = name + " " + ((Consultation) rdv).getPrenom();
    // String age = String.valueOf(((Consultation) rdv).getAge());
    // LocalDateTime now = LocalDateTime.now();

    // // Define a pattern for the formatter
    // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd
    // HH:mm");

    // // Format the LocalDateTime as a String
    // String formattedDateTime = rdv.getDate().format(formatter);
    // String statut = (rdv.getDate().isAfter(now)) ? "arrivé" : "terminé";
    // l.setText(fullname + " " +
    // age + " " +
    // formattedDateTime + " " + statut);

    // }

    // l.setStyle("-fx-font-size: 12px;");

    // rdvArr.add(l);
    // }
    // menu.getItems().addAll(rdvArr);
    // }

}