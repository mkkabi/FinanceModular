package mkkabi.fxml;

import java.io.IOException;
import javafx.scene.control.*;
import java.lang.*;
import java.util.Iterator;
import java.util.logging.Level;

import javafx.fxml.FXML;
import javafx.scene.layout.*;
import mk.mkkabi.clients.WebClient1;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import static mkkabi.entryPoint.MainFxml2.LOGGER;

public class mainPaneBase extends AnchorPane {

	protected final SplitPane splitPane;
	protected final AnchorPane anchorPane;
	protected final ListView listView;
	protected final Label label;
	protected final AnchorPane anchorPane0;
	protected final Button button;
	protected final Button button0;
	protected final TextField textField;
	protected final TextField textField0;
	protected final TextField textField1;
	protected final TextField textField2;
	protected final TextArea textField3;

	public mainPaneBase() {

		splitPane = new SplitPane();
		anchorPane = new AnchorPane();
		listView = new ListView();
		label = new Label();
		anchorPane0 = new AnchorPane();
		button = new Button();
		button0 = new Button();
		textField = new TextField();
		textField0 = new TextField();
		textField1 = new TextField();
		textField2 = new TextField();
		textField3 = new TextArea();

		setMaxHeight(USE_PREF_SIZE);
		setMaxWidth(USE_PREF_SIZE);
		setMinHeight(USE_PREF_SIZE);
		setMinWidth(USE_PREF_SIZE);
		setPrefHeight(400.0);
		setPrefWidth(800.0);

		AnchorPane.setBottomAnchor(splitPane, 0.0);
		AnchorPane.setLeftAnchor(splitPane, 0.0);
		AnchorPane.setRightAnchor(splitPane, 0.0);
		AnchorPane.setTopAnchor(splitPane, 0.0);
		splitPane.setDividerPositions(0.29797979797979796);
		splitPane.setLayoutX(170.0);
		splitPane.setLayoutY(81.0);
		splitPane.setPrefHeight(160.0);
		splitPane.setPrefWidth(200.0);

		anchorPane.setMinHeight(0.0);
		anchorPane.setMinWidth(0.0);
		anchorPane.setPrefHeight(160.0);
		anchorPane.setPrefWidth(100.0);

		AnchorPane.setBottomAnchor(listView, 0.0);
		AnchorPane.setLeftAnchor(listView, 0.0);
		AnchorPane.setRightAnchor(listView, -0.0);
		AnchorPane.setTopAnchor(listView, 0.0);
		listView.setLayoutX(-3.0);
		listView.setPrefHeight(200.0);
		listView.setPrefWidth(190.0);

		AnchorPane.setLeftAnchor(label, 0.0);
		AnchorPane.setRightAnchor(label, 0.0);
		AnchorPane.setTopAnchor(label, 15.0);
		label.setAlignment(javafx.geometry.Pos.CENTER);
		label.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
		label.setLayoutX(69.0);
		label.setLayoutY(14.0);
		label.setText("Accounts");
		label.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

		anchorPane0.setMinHeight(0.0);
		anchorPane0.setMinWidth(0.0);
		anchorPane0.setPrefHeight(160.0);
		anchorPane0.setPrefWidth(100.0);

		button.setLayoutX(14.0);
		button.setLayoutY(14.0);
		button.setMnemonicParsing(false);
		button.setOnMouseClicked(e -> {
			try {
				this.json();
			} catch (ParseException ex) {
			} catch (IOException ex) {
			}
		});
//        button.setOnMouseClicked(this::getAllTransactions);
		button.setText("GetTransactions");

		AnchorPane.setRightAnchor(button0, 30.0);
		button0.setLayoutY(187.0);
		button0.setMnemonicParsing(false);
		button0.setText("Add transaction");

		AnchorPane.setRightAnchor(textField, 20.0);
		textField.setLayoutY(27.0);
		textField.setPromptText("textField");

		AnchorPane.setRightAnchor(textField0, 20.0);
		textField0.setLayoutY(64.0);
		textField0.setPromptText("textField0");

		AnchorPane.setRightAnchor(textField1, 20.0);
		textField1.setLayoutY(102.0);
		textField1.setPromptText("textField1");

		AnchorPane.setRightAnchor(textField2, 20.0);
		textField2.setLayoutY(140.0);
		textField2.setPromptText("textField2");

		AnchorPane.setLeftAnchor(textField3, 15.0);
		AnchorPane.setTopAnchor(textField3, 55.0);
		AnchorPane.setRightAnchor(textField3, 220.0);

		anchorPane.getChildren().add(listView);
		anchorPane.getChildren().add(label);
		splitPane.getItems().add(anchorPane);
		anchorPane0.getChildren().add(button);
		anchorPane0.getChildren().add(button0);
		anchorPane0.getChildren().add(textField);
		anchorPane0.getChildren().add(textField0);
		anchorPane0.getChildren().add(textField1);
		anchorPane0.getChildren().add(textField2);
		anchorPane0.getChildren().add(textField3);
		splitPane.getItems().add(anchorPane0);
		getChildren().add(splitPane);

	}

	public void getAllTransactions() {
		System.out.println("test");
		WebClient1 webClient = new WebClient1();

//        try {
//            System.out.println(WebClient1.getAllTransactions("http://mkkabi.mk.ua/api/transaction/read.php"));
//            textField3.setText(webClient.getAllTransactions("http://mkkabi.mk.ua/api/transaction/read.php"));
//         } catch (IOException ex) {
//            System.out.println(ex);
//        }
	}

	public void json() throws ParseException, IOException {
		Runnable r = () -> {

			WebClient1 webClient = new WebClient1();
			try {
				Object obj = new JSONParser().parse(WebClient1.getAllTransactions("http://mkkabi.mk.ua/api/transaction/read.php"));

				JSONObject jo = (JSONObject) obj;
				JSONArray ja = (JSONArray) jo.get("records");
				Iterator itr2 = ja.iterator();
				StringBuffer sb = new StringBuffer();
				while (itr2.hasNext()) {
					Object obj2 = itr2.next();
					JSONObject jo2 = (JSONObject) obj2;
					String description = (String) jo2.get("description");
					sb.append(description);
					sb.append("\n");

					System.out.println(description);
					LOGGER.log(Level.SEVERE, "test message from mainPaneBase");
				}
				textField3.setText(sb.toString());
			} catch (IOException ex) {
				System.out.println(ex.toString());
			} catch (ParseException ex) {
				System.out.println(ex.toString());
			}
		};
		Thread t = new Thread(r, "Json parser");
		t.start();

	}
	
	
}
