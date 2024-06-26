import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;

public class Controller {

    @FXML
    private Button loginBtn;

    @FXML
    private PasswordField password;

    @FXML
    private TextField username;
    @FXML
    private Label loginFailed;

    @FXML
    void login(ActionEvent event) {
        String user = username.getText();
        String pass = password.getText();
        if (Main.app.login(user, pass)) {
            FXMLLoader l = Main.h.changeScene("Hello.fxml", event);
            ControllerHello controller = l.getController();
            controller.setUsername();

        } else
            setLoginFailed();

    }

    public void setLoginFailed() {
        loginFailed.setText("Email incorrect ou password incorrect");
    }
}