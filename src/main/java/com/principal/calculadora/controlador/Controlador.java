package com.principal.calculadora.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

/**
 * FXML Controller class
 *
 */
public class Controlador {
    
    private double valor1 = 0;
    private double valor2 = 0;
    private double resultado = 0;
    private String operacao = "";
    
    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }
    
    @FXML
    private TextField visorPrincipal;
    @FXML
    private TextField visorSecundario;
    
    
    @FXML
    protected void inserirPrincipal(ActionEvent e){
        String numero = ((Button) e.getSource()).getText();
        String antigo = visorPrincipal.getText();
        visorPrincipal.setText(antigo + numero);
    }
    protected void inserirSecundario(ActionEvent e, String operador){
       
         String numero = visorPrincipal.getText();
         visorPrincipal.setText("0");
         visorSecundario.setText(numero + operador);
         
    }
    
    @FXML
    protected void multiplicacao(ActionEvent e) {
        setValor1(Double.parseDouble(visorTextField.getText()));
                 visorTextField.setText("");
                 setOperacao("*");
    }
    
    @FXML
    protected void divisao(ActionEvent e) {
        setValor1(Double.parseDouble(visorTextField.getText()));
                 visorTextField.setText("");
                 setOperacao("/");
    }
    
    @FXML
    protected void soma(ActionEvent e) {
        setValor1(Double.parseDouble(visorTextField.getText()));
                 visorTextField.setText("");
                 setOperacao("+");
    }
    
    @FXML
    protected void subtracao(ActionEvent e) {
        setValor1(Double.parseDouble(visorTextField.getText()));
                 visorTextField.setText("");
                 setOperacao("-");
    }
    
    @FXML
    protected void apagarTudo(ActionEvent e) {
        visorTextField.setText("");
                 setValor1(0);
                 setValor2(0);
                 setOperacao("");
        
    }
    
    @FXML
    protected void igual(ActionEvent e) {
        setValor2(Double.parseDouble(visorTextField.getText()));
                
                switch(operacao) {
                    case "+":
                        setResultado(getValor1() + getValor2());
                        visorPrincipal.setText(String.valueOf(getResultado()));
                        break;
                    case "-":
                        setResultado(getValor1() - getValor2());
                        visorPrincipal.setText(String.valueOf(getResultado()));
                        break;
                    case "*":
                        setResultado(getValor1() * getValor2());
                        visorTextField.setText(String.valueOf(getResultado()));
                        break;
                    case "/":
                        setResultado(getValor1() / getValor2());
                        visorTextField.setText(String.valueOf(getResultado()));
                        break;
                }
                
                if(valor1 == 0 && valor2 == 0 && operacao == "/") {
                    visorPrincipal.setText("Erro!");
                }
    }
    
    
}
