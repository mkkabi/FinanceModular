/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mkkabi.entryPoint;

import java.io.IOException;
import java.util.*;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import mkkabi.fxml.*;
import java.util.logging.*;
import mkkabi.fxml.MainPaneController;
import org.apache.commons.logging.*;

 
public class MainFxml2 extends Application {

	

	private AnchorPane root;

	@Override
	public void start(Stage primaryStage) throws IOException {
		root = new mainPane2Base();

		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();

			
			
		//primaryStage.setOnCloseRequest(w -> model.saveCurrentState());
	}

	public static void main(String[] args) {
		launch();
	}

}
