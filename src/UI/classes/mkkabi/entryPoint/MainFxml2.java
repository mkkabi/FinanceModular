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

/**
 *
 * @author matt
 */
public class MainFxml2 extends Application {

	public static final Logger LOGGER = Logger.getLogger("main");
	FileHandler fileHandler;
	Handler consoleHandler;
	private AnchorPane root;

	@Override
	public void start(Stage primaryStage) throws IOException {
		root = new mainPaneBase();

		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
 

		consoleHandler = new ConsoleHandler();
			fileHandler  = new FileHandler("log.txt");
			
			//Assigning handlers to LOGGER object
			LOGGER.addHandler(consoleHandler);
			LOGGER.addHandler(fileHandler);
			
			//Setting levels to handlers and LOGGER
			consoleHandler.setLevel(Level.ALL);
			fileHandler.setLevel(Level.ALL);
			LOGGER.setLevel(Level.ALL);
			
			LOGGER.config("Configuration done.");
			
			//Console handler removed
			LOGGER.removeHandler(consoleHandler);
			
			LOGGER.log(Level.FINE, "Finer logged");
			
			
			
		//primaryStage.setOnCloseRequest(w -> model.saveCurrentState());
	}

	public static void main(String[] args) {
		launch();
	}

}
