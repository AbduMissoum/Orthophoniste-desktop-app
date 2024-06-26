
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

import TP.*;

public class Main extends Application {
    public static App app = App.deserializeApp();
    public static Helper h = new Helper();

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Login.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Controller controller = fxmlLoader.getController();
        // Example of additional controller initialization
        // controller.initializeData(someData);

        primaryStage.setTitle("JavaFX App");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setOnCloseRequest(event -> Main.app.serialize());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
