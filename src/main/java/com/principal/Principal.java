package com.principal;
import javafx.scene.*;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.application.Application;

public class Principal extends Application{
    
    public void start(Stage stage) throws Exception {
       FXMLLoader fxml = new FXMLLoader(Exec.class.getResource("/com/principal/calculadora/fxml/padrão.fxml"));
       Parent root = fxml.load();
       Scene scene = new Scene(root);
       stage.setScene(scene);
       stage.show();
       
    }
    
    public static void main(String[] args) {
        launch();
    }
}