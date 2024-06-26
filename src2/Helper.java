import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import TP.*;

public class Helper {

    public FXMLLoader changeScene(String scenePath, ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(scenePath));
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stage.setScene(new Scene(root));
            stage.show();
            return loader;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
