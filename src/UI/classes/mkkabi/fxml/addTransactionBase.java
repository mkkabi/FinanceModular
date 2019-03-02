package javafxapplication15;

import javafx.scene.control.*;
import java.lang.*;
import javafx.scene.layout.*;

public abstract class addTransactionBase extends AnchorPane {

    protected final ComboBox comboBox;
    protected final DatePicker datePicker;
    protected final TextField textField;
    protected final TextField textField0;
    protected final ComboBox comboBox0;
    protected final Button button;
    protected final CheckBox checkBox;

    public addTransactionBase() {

        comboBox = new ComboBox();
        datePicker = new DatePicker();
        textField = new TextField();
        textField0 = new TextField();
        comboBox0 = new ComboBox();
        button = new Button();
        checkBox = new CheckBox();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(450.0);
        setPrefWidth(250.0);

        AnchorPane.setLeftAnchor(comboBox, 15.0);
        AnchorPane.setRightAnchor(comboBox, 15.0);
        AnchorPane.setTopAnchor(comboBox, 15.0);
        comboBox.setLayoutY(14.0);
        comboBox.setPrefWidth(150.0);
        comboBox.setPromptText("Account");

        AnchorPane.setLeftAnchor(datePicker, 15.0);
        AnchorPane.setRightAnchor(datePicker, 15.0);
        AnchorPane.setTopAnchor(datePicker, 190.0);
        datePicker.setLayoutX(27.0);
        datePicker.setLayoutY(194.0);
        datePicker.setPromptText("Date");

        AnchorPane.setLeftAnchor(textField, 15.0);
        AnchorPane.setRightAnchor(textField, 15.0);
        AnchorPane.setTopAnchor(textField, 55.0);
        textField.setLayoutX(40.0);
        textField.setLayoutY(52.0);
        textField.setPromptText("Amount");

        AnchorPane.setLeftAnchor(textField0, 15.0);
        AnchorPane.setRightAnchor(textField0, 15.0);
        AnchorPane.setTopAnchor(textField0, 95.0);
        textField0.setLayoutX(40.0);
        textField0.setLayoutY(94.0);
        textField0.setPromptText("Description");

        AnchorPane.setLeftAnchor(comboBox0, 15.0);
        AnchorPane.setRightAnchor(comboBox0, 15.0);
        AnchorPane.setTopAnchor(comboBox0, 135.0);
        comboBox0.setLayoutX(51.0);
        comboBox0.setLayoutY(138.0);
        comboBox0.setPrefWidth(150.0);
        comboBox0.setPromptText("Category");

        AnchorPane.setBottomAnchor(button, 15.0);
        AnchorPane.setRightAnchor(button, 15.0);
        button.setLayoutX(180.0);
        button.setLayoutY(411.0);
        button.setMnemonicParsing(false);
        button.setText("Add");

        AnchorPane.setBottomAnchor(checkBox, 185.0);
        AnchorPane.setLeftAnchor(checkBox, 14.0);
        AnchorPane.setTopAnchor(checkBox, 230.0);
        checkBox.setLayoutX(14.0);
        checkBox.setLayoutY(247.0);
        checkBox.setMnemonicParsing(false);
        checkBox.setText("Save as template");

        getChildren().add(comboBox);
        getChildren().add(datePicker);
        getChildren().add(textField);
        getChildren().add(textField0);
        getChildren().add(comboBox0);
        getChildren().add(button);
        getChildren().add(checkBox);

    }
}
