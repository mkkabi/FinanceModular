package mkkabi.fxml;

import javafx.scene.control.*;
import java.lang.*;
import javafx.scene.layout.*;

public class mainPane2Base extends AnchorPane {

    protected final MenuBar menuBar;
    protected final Menu menu;
    protected final MenuItem menuItem;
    protected final MenuItem menuItem0;
    protected final Menu menu0;
    protected final MenuItem menuItem1;
    protected final Menu menu1;
    protected final MenuItem menuItem2;
    protected final SplitPane splitPane;
    protected final AnchorPane anchorPane;
    protected final ListView listView;
    protected final Label label;
    protected final AnchorPane anchorPane0;
    protected final TableView tableView;
    protected final TableColumn tableColumn;
    protected final TableColumn tableColumn0;
    protected final Button button;
    protected final Label label0;
    protected final Label label1;
    protected final Label label2;
    protected final Label label3;

    public mainPane2Base() {

        menuBar = new MenuBar();
        menu = new Menu();
        menuItem = new MenuItem();
        menuItem0 = new MenuItem();
        menu0 = new Menu();
        menuItem1 = new MenuItem();
        menu1 = new Menu();
        menuItem2 = new MenuItem();
        splitPane = new SplitPane();
        anchorPane = new AnchorPane();
        listView = new ListView();
        label = new Label();
        anchorPane0 = new AnchorPane();
        tableView = new TableView();
        tableColumn = new TableColumn();
        tableColumn0 = new TableColumn();
        button = new Button();
        label0 = new Label();
        label1 = new Label();
        label2 = new Label();
        label3 = new Label();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(479.0);
        setPrefWidth(800.0);
        getStylesheets().add("style.css");

        AnchorPane.setLeftAnchor(menuBar, 0.0);
        AnchorPane.setRightAnchor(menuBar, 0.0);
        AnchorPane.setTopAnchor(menuBar, 0.0);

        menu.setMnemonicParsing(false);
        menu.setText("File");

        menuItem.setMnemonicParsing(false);
        menuItem.setText("new Account");

        menuItem0.setMnemonicParsing(false);
        menuItem0.setText("Delete Account");

        menu0.setMnemonicParsing(false);
        menu0.setText("Edit");

        menuItem1.setMnemonicParsing(false);
        menuItem1.setText("Delete");

        menu1.setMnemonicParsing(false);
        menu1.setText("Help");

        menuItem2.setMnemonicParsing(false);
        menuItem2.setText("About");

        AnchorPane.setBottomAnchor(splitPane, 0.0);
        AnchorPane.setLeftAnchor(splitPane, 0.0);
        AnchorPane.setRightAnchor(splitPane, 0.0);
        AnchorPane.setTopAnchor(splitPane, 29.0);
        splitPane.setDividerPositions(0.29797979797979796);
        splitPane.setPrefHeight(160.0);
        splitPane.setPrefWidth(200.0);

        anchorPane.setMinHeight(0.0);
        anchorPane.setMinWidth(0.0);
        anchorPane.setPrefHeight(160.0);
        anchorPane.setPrefWidth(100.0);

        AnchorPane.setBottomAnchor(listView, 0.0);
        AnchorPane.setLeftAnchor(listView, 0.0);
        AnchorPane.setRightAnchor(listView, 0.0);
        AnchorPane.setTopAnchor(listView, 50.0);
        listView.setPrefHeight(200.0);
        listView.setPrefWidth(200.0);

        AnchorPane.setLeftAnchor(label, 0.0);
        AnchorPane.setRightAnchor(label, 0.0);
        AnchorPane.setTopAnchor(label, 15.0);
        label.setAlignment(javafx.geometry.Pos.CENTER);
        label.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        label.setLayoutX(99.0);
        label.setLayoutY(14.0);
        label.setText("Accounts");

        anchorPane0.setMinHeight(0.0);
        anchorPane0.setMinWidth(0.0);
        anchorPane0.setPrefHeight(160.0);
        anchorPane0.setPrefWidth(100.0);

        AnchorPane.setBottomAnchor(tableView, 15.0);
        AnchorPane.setLeftAnchor(tableView, 15.0);
        AnchorPane.setRightAnchor(tableView, 15.0);
        AnchorPane.setTopAnchor(tableView, 115.0);
        tableView.setLayoutY(70.0);
        tableView.setPrefHeight(289.0);
        tableView.setPrefWidth(526.0);

        tableColumn.setPrefWidth(75.0);
        tableColumn.setText("C1");

        tableColumn0.setPrefWidth(75.0);
        tableColumn0.setText("C2");

        AnchorPane.setBottomAnchor(button, 15.0);
        AnchorPane.setRightAnchor(button, 15.0);
        button.setLayoutX(513.0);
        button.setLayoutY(359.0);
        button.setMnemonicParsing(false);
        button.setText("+");

        AnchorPane.setLeftAnchor(label0, 25.0);
        AnchorPane.setTopAnchor(label0, 40.0);
        label0.setLayoutX(27.0);
        label0.setLayoutY(27.0);
        label0.setText("Current balance:");

        AnchorPane.setLeftAnchor(label1, 25.0);
        AnchorPane.setTopAnchor(label1, 60.0);
        label1.setLayoutX(27.0);
        label1.setLayoutY(54.0);
        label1.setText("Total Spendings:");

        AnchorPane.setLeftAnchor(label2, 25.0);
        AnchorPane.setTopAnchor(label2, 80.0);
        label2.setLayoutX(27.0);
        label2.setLayoutY(81.0);
        label2.setText("Total Income:");

        AnchorPane.setLeftAnchor(label3, 25.0);
        AnchorPane.setTopAnchor(label3, 15.0);
        label3.setLayoutX(27.0);
        label3.setLayoutY(7.0);
        label3.setText("Account: ");

        menu.getItems().add(menuItem);
        menu.getItems().add(menuItem0);
        menuBar.getMenus().add(menu);
        menu0.getItems().add(menuItem1);
        menuBar.getMenus().add(menu0);
        menu1.getItems().add(menuItem2);
        menuBar.getMenus().add(menu1);
        getChildren().add(menuBar);
        anchorPane.getChildren().add(listView);
        anchorPane.getChildren().add(label);
        splitPane.getItems().add(anchorPane);
        tableView.getColumns().add(tableColumn);
        tableView.getColumns().add(tableColumn0);
        anchorPane0.getChildren().add(tableView);
        anchorPane0.getChildren().add(button);
        anchorPane0.getChildren().add(label0);
        anchorPane0.getChildren().add(label1);
        anchorPane0.getChildren().add(label2);
        anchorPane0.getChildren().add(label3);
        splitPane.getItems().add(anchorPane0);
        getChildren().add(splitPane);

    }
}
