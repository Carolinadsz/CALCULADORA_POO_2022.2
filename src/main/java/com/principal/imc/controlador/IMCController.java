package com.principal.imc.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;


/**
 * FXML Controller class
 *
 * @author DELL
 */
public class IMCController implements Initializable {

    @FXML
    private Button calcularbutton;

    @FXML
    private Label labelclassificacao;

    @FXML
    private Label txtIMC;

    @FXML
    private TextField txtPeso;

    @FXML
    private TextField txtaltura;

    @FXML
    private AnchorPane txtclassifacao;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    Float peso, altura, imc;
     
    @FXML
    void calcular(ActionEvent event) {
        peso = Float.parseFloat(txtPeso.getText());
        altura = Float.parseFloat(txtaltura.getText());
         imc = peso / (altura*altura);
        txtIMC.setText(String.valueOf(imc));
        if (imc < 18.5){
            labelclassificacao.setText("Abaixo do peso");}
            else if (imc >18.5 &&  imc <24.9 ){
            labelclassificacao.setText("Peso Normal");}
            else if (imc > 25 && imc <29.9){
            labelclassificacao.setText("Sobrepeso");}
            else if (imc > 30 && imc <34.9){
            labelclassificacao.setText("Obesidade grau I");}
            else if (imc > 35 && imc <39.9) {
            labelclassificacao.setText("Obesidade grau II");}
            else if (imc > 40){
            labelclassificacao.setText("Obesidade grau III");}
            else {
                    System.out.println("Erro");
                    }         
    } 
            
}
      