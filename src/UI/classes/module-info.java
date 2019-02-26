/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

module UI {
    requires AppModel;
    requires AccountModel;
    requires Connections;

    requires javafx.controls;
    requires javafx.base;
    requires javafx.fxml;
    requires java.base;

    exports mkkabi.entryPoint;
    exports mkkabi.fxml;
}
