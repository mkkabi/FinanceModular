/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mkkabi.fxml;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import mk.mkkabi.clients.WebClient;
import mk.mkkabi.clients.WebClient1;

public class MainPaneController implements Initializable {

     @FXML private Button button;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        button.setText("asdfasdf");
     }

    @FXML
    public void getAllTransactions() {
        System.out.println("test");
        WebClient1 webClient = new WebClient1();

        try {
            System.out.println(webClient.getAllTransactions("http://mkkabi.mk.ua/api/transaction/read.php"));
//            textarea1.setText(webClient.getAllTransactions("http://mkkabi.mk.ua/api/transaction/read.php"));
         } catch (IOException ex) {
            System.out.println(ex);
        }

    }
}
