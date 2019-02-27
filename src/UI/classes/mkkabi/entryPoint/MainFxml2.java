/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mkkabi.entryPoint;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import mkkabi.fxml.*;
import mkkabi.fxml.MainPaneController;

/**
 *
 * @author matt
 */
public class MainFxml2 extends Application {

    private AnchorPane root;

    @Override
    public void start(Stage primaryStage) throws IOException {
 
            root = new mainPaneBase();
 
 
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
 

        //primaryStage.setOnCloseRequest(w -> model.saveCurrentState());
    }

    public static void main(String[] args) {
        launch();
    }

}
