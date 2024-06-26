import TP.Orthophoniste;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ControllerMonCompte {

    @FXML
    private Label adresse;

    @FXML
    private Label mail;

    @FXML
    private Label nom;

    @FXML
    private Label prenom;

    @FXML
    private Button retour;

    @FXML
    private Label tel;

    public void set() {
        Orthophoniste o = Main.app.getOrthophoniste();

        nom.setText("Nom:" + o.getNom());
        mail.setText("Nom:" + o.getMail());
        prenom.setText("Nom:" + o.getPrenom());
        adresse.setText("Nom:" + o.getAdresse());
        tel.setText(tel.getText() + o.getTel());

    }

    @FXML
    void retourHello(ActionEvent event) {
        FXMLLoader l = Main.h.changeScene("Hello.fxml", event);

    }

}
