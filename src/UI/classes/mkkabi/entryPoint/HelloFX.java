package mkkabi.entryPoint;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloFX extends Application {

	@Override
	public void start(Stage stage) {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
		  Button testButton = new Button("test");
		  
		  StackPane stack = new StackPane();
		  stack.getChildren().add(l);
		  stack.getChildren().add(testButton);
        Scene scene = new Scene(stack, 640, 480);
		  
		  
		  
        stage.setScene(scene);
        stage.show();
	}

	public static void main(String[] args) {
		launch();
	}

}
