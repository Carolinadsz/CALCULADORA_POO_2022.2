package com.principal;

import java.io.File;
import java.net.URL;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Yasmi
 */
public class NewFXMain extends Application {
    private static Stage stage;
    private static Scene sceneLogin;
    private static Scene sceneCadastro;
    private static Scene sceneSelecao;

    
    @Override
    public void start(Stage stage) throws Exception {
        URL urlLogin = new File("").toURI().toURL();
        Parent rootLogin = FXMLLoader.load(urlLogin);        
        sceneLogin = new Scene(rootLogin);
        
        URL urlCadastro = new File("").toURI().toURL();
        Parent rootCadastro = FXMLLoader.load(urlCadastro);        
        sceneCadastro = new Scene(rootCadastro);
        
        URL urlSelecao = new File("").toURI().toURL();
        Parent rootSelecao = FXMLLoader.load(urlSelecao);        
        sceneSelecao = new Scene(rootSelecao);
        
        stage.setScene(sceneCadastro);        
        stage.show();
    }
    
    
    public static void main(String[] args) {
        launch(args);
        
    }
    
}
