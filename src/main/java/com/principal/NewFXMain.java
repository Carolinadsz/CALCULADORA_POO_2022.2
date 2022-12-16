package com.principal;

import java.io.File;
import java.net.URL;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * @author Yasmi
 */

public class NewFXMain extends Application {
    private static Stage stage;
    private static Scene scene;
    private static Parent root;

    FXMLLoader loadCadastro = new FXMLLoader(NewFXMain.class.getResource("/com/principal/cadastro/fxml/FXMLCadastro.fxml"));
    FXMLLoader loadLogin = new FXMLLoader(NewFXMain.class.getResource("/com/principal/login/fxml/FXMLlogin.fxml"));
    FXMLLoader loadSelecao = new FXMLLoader(NewFXMain.class.getResource("/com/principal/selecao/fxml/FXMLSelecao.fxml"));

    
    @Override
    public void start(Stage primaryStage) throws Exception {
        root = loadLogin.load();        
        scene = new Scene(root);
                
        stage.setScene(scene);        
        stage.show();
    }
    
    
    public static void main(String[] args) {
        launch(args);
        
    }
    
}
