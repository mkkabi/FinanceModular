package mkkabi.entryPoint;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import mkkabi.fxml.MainPaneController;

public class MainFxml extends Application {

    private AnchorPane root;

    @Override
    public void start(Stage primaryStage) throws IOException {
        try {
            FXMLLoader mainDocumentLoader = new FXMLLoader();
            mainDocumentLoader.setLocation(getClass().getResource("/mkkabi/fxml/mainPane.fxml"));
            root = mainDocumentLoader.load();
            MainPaneController mainPaneController = mainDocumentLoader.getController();

            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        //primaryStage.setOnCloseRequest(w -> model.saveCurrentState());
    }

    public static void main(String[] args) {
        launch();
    }

}
