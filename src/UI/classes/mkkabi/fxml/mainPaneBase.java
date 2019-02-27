package mkkabi.fxml;

import javafx.scene.control.*;
import java.lang.*;
import javafx.scene.layout.*;

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
    protected final TextField textField3;
    protected final Button button1;

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
        textField3 = new TextField();
        button1 = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

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
        //button.setOnMouseClicked(this::getAllTransactions);
        button.setText("GetTransactions");

        button0.setLayoutX(274.0);
        button0.setLayoutY(187.0);
        button0.setMnemonicParsing(false);
        button0.setText("Add transaction");

        textField.setLayoutX(218.0);
        textField.setLayoutY(27.0);
        textField.setPromptText("amount");

        textField0.setLayoutX(218.0);
        textField0.setLayoutY(64.0);
        textField0.setPromptText("description");

        textField1.setLayoutX(218.0);
        textField1.setLayoutY(102.0);
        textField1.setPromptText("source");

        textField2.setLayoutX(218.0);
        textField2.setLayoutY(140.0);

        AnchorPane.setLeftAnchor(textField3, 15.0);
        AnchorPane.setTopAnchor(textField3, 55.0);

        button1.setText("Click Me!");

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
        anchorPane0.getChildren().add(button1);
        splitPane.getItems().add(anchorPane0);
        getChildren().add(splitPane);

    }

    //protected abstract void getAllTransactions(javafx.scene.input.MouseEvent mouseEvent);

}
