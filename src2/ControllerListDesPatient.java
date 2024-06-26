import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import TP.*;

public class ControllerListDesPatient {

    @FXML
    private TableView<rowPatient> menu;

    @FXML
    private Button retourMesPatient;

    public void print() {

        List<rowPatient> rowList = new ArrayList<>();
        // Define the columns
        TableColumn<rowPatient, String> NumDossierCol = new TableColumn<>("Num dossier");
        NumDossierCol.setCellValueFactory(new PropertyValueFactory<>("NumDossier"));

        TableColumn<rowPatient, String> firstNameCol = new TableColumn<>("Nom");
        firstNameCol.setCellValueFactory(new PropertyValueFactory<>("Nom"));

        TableColumn<rowPatient, String> lastNameCol = new TableColumn<>("Prenom");
        lastNameCol.setCellValueFactory(new PropertyValueFactory<>("Prenom"));

        TableColumn<rowPatient, Integer> ageCol = new TableColumn<>("Age");
        ageCol.setCellValueFactory(new PropertyValueFactory<>("Age"));

        TableColumn<rowPatient, String> typeCol = new TableColumn<>("Adule/Enfant");
        typeCol.setCellValueFactory(new PropertyValueFactory<>("type"));
        // Add columns to the table
        TableColumn<rowPatient, Button> learncol = new TableColumn<>(" ");
        learncol.setCellValueFactory(new PropertyValueFactory<>("learn"));

        menu.getColumns().addAll(NumDossierCol, firstNameCol, lastNameCol, ageCol, typeCol, learncol);
        Orthophoniste o = Main.app.getOrthophoniste();
        for (DossierP dossier : o.getPatientList()) {
            rowPatient row = new rowPatient(dossier);
            row.getLearn().setOnAction(e -> {
                if (dossier.getPatient() instanceof Adulte) {
                    FXMLLoader l = Main.h.changeScene("AffichAdulte.fxml", e);
                    ControllerAfficherAdult controller = l.getController();
                    controller.set(dossier.getPatient());
                } else {
                    FXMLLoader l = Main.h.changeScene("AffichEnfant.fxml", e);
                    ControllerAfficherAdult controller = l.getController();
                    controller.set(dossier.getPatient());
                }

            });

            rowList.add(row);

        }
        ObservableList<rowPatient> singleItemList = FXCollections.observableArrayList(rowList);

        // Set the items to the TableView
        menu.setItems(singleItemList);

    }

    @FXML
    public void retourMesPatient(ActionEvent event) {
        FXMLLoader l = Main.h.changeScene("MesPatients.fxml", event);

    }

}
