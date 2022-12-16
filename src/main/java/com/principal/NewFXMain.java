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
    private static Scene sceneLogin;
    private static Scene sceneCadastro;
    private static Scene sceneSelecao;

    
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loadLogin = new FXMLLoader(NewFXMain.class.getResource("/com/principal/cadastro/fxml/FXMLCadastro.fxml"));
        Parent rootLogin = loadLogin.load();        
        sceneLogin = new Scene(rootLogin);
        
        stage.setScene(sceneLogin);        
        stage.show();
    }
    
    
    public static void main(String[] args) {
        launch(args);
        
    }
    
}
