import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.time.*;
import java.util.ArrayList;
import java.util.List;
import TP.*;

public class ControllerMesSuivi {

    @FXML
    private TableView<rowSuivi> Menu;

    @FXML
    void retourMesRdv(ActionEvent event) {
        FXMLLoader l = Main.h.changeScene("MesRdv.fxml", event);
        ControllerMesRdv controller = l.getController();
        controller.setUsername();
    }

    public void print() {

        TableColumn<rowSuivi, String> numCol = new TableColumn<>("Num Dossier");
        numCol.setCellValueFactory(new PropertyValueFactory<>("numDossier"));

        TableColumn<rowSuivi, LocalDateTime> dateCol = new TableColumn<>("Date");
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));

        TableColumn<rowSuivi, String> deroulementCol = new TableColumn<>("Deroulement");
        deroulementCol.setCellValueFactory(new PropertyValueFactory<>("deroulement"));

        TableColumn<rowSuivi, Button> learncol = new TableColumn<>(" ");
        learncol.setCellValueFactory(new PropertyValueFactory<>("learn"));
        List<rowSuivi> rowList = new ArrayList<>();

        Menu.getColumns().addAll(numCol, dateCol, deroulementCol, learncol);
        Orthophoniste o = Main.app.getOrthophoniste();
        for (Rdv rdv : o.getRdvList()) {
            if (rdv instanceof Suivi) {
                rowSuivi r = new rowSuivi(rdv);
                r.getLearn().setOnAction(e -> {
                    FXMLLoader l = Main.h.changeScene("AffichSuivi.fxml", e);
                    ControllerAfficherSuivi controller = l.getController();
                    controller.set(rdv);
                });

                rowList.add(r);
            }
        }
        ObservableList<rowSuivi> singleItemList = FXCollections.observableArrayList(rowList);

        // Set the items to the TableView
        Menu.setItems(singleItemList);

    }

}
