package com.principal.login.controlador;

import com.principal.NewFXMain;
import java.net.URL;
import javafx.stage.Stage;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import com.principal.NewFXMain;
import javafx.scene.control.SplitPane;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.FXML;
import javafx.scene.Node;


/**
 * @author Yasmi
 */

public class FXMLloginControlador implements Initializable{
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Button loginBtn;

    @FXML
    private TextField userNameLoginField;

    @FXML
    private TextField userPasssordLoginField;

    @FXML
    void setSelection(ActionEvent event) throws Exception {
        NewFXMain change = new NewFXMain();
        change.changeScreen(1);
    }
    
    @FXML
    void setCadastro(ActionEvent event) throws Exception{
        NewFXMain change = new NewFXMain();
        change.changeScreen(2);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
  
    }    
    
}
