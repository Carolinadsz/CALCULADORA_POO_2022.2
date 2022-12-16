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
    
<<<<<<< HEAD
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
=======
    private long valor1 = 0;
    private long valor2 = 0;
    private long resultado = 0;
    private String operacao = "";
    
    public long getValor1() {
        return valor1;
    }

    public void setValor1(long valor1) {
        this.valor1 = valor1;
    }

    public long getValor2() {
        return valor2;
    }

    public void setValor2(long valor2) {
        this.valor2 = valor2;
    }

    public long getResultado() {
        return resultado;
    }

    public void setResultado(long resultado) {
>>>>>>> 2a275440802492206790c8964a0dc3f05e02a308
        this.resultado = resultado;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }
    
    @FXML
<<<<<<< HEAD
    private TextField visorTextField;
=======
    private TextField visorPrincipal;
    @FXML
    private TextField visorSecundario;
    
>>>>>>> 2a275440802492206790c8964a0dc3f05e02a308
    
    @FXML
    protected void inserir(ActionEvent e){
        String numero = ((Button) e.getSource()).getText();
<<<<<<< HEAD
        String antigo = visorTextField.getText();
        visorTextField.setText(antigo + numero);
=======
        System.out.println(visorPrincipal.getText().contains("0"));
        
        if (visorPrincipal.getText().startsWith("0")){
            visorPrincipal.setText("");
            visorPrincipal.setText( numero);
        }
        else {
            String antigo = visorPrincipal.getText();
            visorPrincipal.setText( antigo+numero);
        }  
>>>>>>> 2a275440802492206790c8964a0dc3f05e02a308
    }
    
    @FXML
    protected void multiplicacao(ActionEvent e) {
<<<<<<< HEAD
        setValor1(Double.parseDouble(visorTextField.getText()));
                 visorTextField.setText("");
                 setOperacao("*");
=======
        this.valor1 = Long.parseLong(visorPrincipal.getText());
        this.visorSecundario.setText(this.valor1 + " * ");
        this.operacao = "*";
        visorPrincipal.setText("");
          
>>>>>>> 2a275440802492206790c8964a0dc3f05e02a308
    }
    
    @FXML
    protected void divisao(ActionEvent e) {
<<<<<<< HEAD
        setValor1(Double.parseDouble(visorTextField.getText()));
                 visorTextField.setText("");
                 setOperacao("/");
=======
        this.valor1 = Long.parseLong(visorPrincipal.getText());
        this.visorSecundario.setText(this.valor1 + " / ");
        this.operacao = "/";
        visorPrincipal.setText("");
>>>>>>> 2a275440802492206790c8964a0dc3f05e02a308
    }
    
    @FXML
    protected void soma(ActionEvent e) {
<<<<<<< HEAD
        setValor1(Double.parseDouble(visorTextField.getText()));
                 visorTextField.setText("");
                 setOperacao("+");
=======
        this.valor1 = Long.parseLong(visorPrincipal.getText());
        this.visorSecundario.setText(this.valor1 + " + ");
        this.operacao = "+";
        visorPrincipal.setText("");
>>>>>>> 2a275440802492206790c8964a0dc3f05e02a308
    }
    
    @FXML
    protected void subtracao(ActionEvent e) {
<<<<<<< HEAD
        setValor1(Double.parseDouble(visorTextField.getText()));
                 visorTextField.setText("");
                 setOperacao("-");
=======
        this.valor1 = Long.parseLong(visorPrincipal.getText());
        this.visorSecundario.setText(this.valor1 + " - ");
        this.operacao = "-";
        visorPrincipal.setText("");
    }
    
    @FXML
    protected void raizQuad(ActionEvent e) {
        System.out.println(valor2);
        visorPrincipal.setText(String.valueOf(valor2 * valor2));
>>>>>>> 2a275440802492206790c8964a0dc3f05e02a308
    }
    
    @FXML
    protected void apagarTudo(ActionEvent e) {
<<<<<<< HEAD
        visorTextField.setText("");
                 setValor1(0);
                 setValor2(0);
                 setOperacao("");
        
=======
        visorPrincipal.setText("0");
        visorSecundario.setText("");
        setValor1(0);
        setValor2(0);
        setOperacao("");
        setResultado(0);
    }
    
    @FXML
    protected void apagarCE(ActionEvent e) {
        valor2 = 0;
        visorPrincipal.setText("");
    }
    
    @FXML
    protected void apagar(ActionEvent e) {
        String visor = visorPrincipal.getText();
        visorPrincipal.setText(visor.substring(0, visor.length() - 1));
>>>>>>> 2a275440802492206790c8964a0dc3f05e02a308
    }
    
    @FXML
    protected void igual(ActionEvent e) {
<<<<<<< HEAD
        setValor2(Double.parseDouble(visorTextField.getText()));
                
                switch(operacao) {
                    case "+":
                        setResultado(getValor1() + getValor2());
                        visorTextField.setText(String.valueOf(getResultado()));
                        break;
                    case "-":
                        setResultado(getValor1() - getValor2());
                        visorTextField.setText(String.valueOf(getResultado()));
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
                    visorTextField.setText("Erro!");
                }
=======
        valor2 = Long.parseLong(visorPrincipal.getText());
        System.out.println(operacao + "");

       
        if(operacao == "*") {
            System.out.println(valor2);
            visorPrincipal.setText(String.valueOf(valor1 * valor2));
        }
        else if(operacao == "/") {
            System.out.println(valor2);
            visorPrincipal.setText(String.valueOf(valor1 / valor2));
        }
        else if(operacao == "+") {
            System.out.println(valor2);
            visorPrincipal.setText(String.valueOf(valor1 + valor2));
        }
        else if(operacao == "-") {
            System.out.println(valor2);
            visorPrincipal.setText(String.valueOf(valor1 - valor2));
        }
        
        if(valor1 == 0 && valor2 == 0 && operacao == "/") {;
        visorPrincipal.setText("Erro!");
        }
    //               
    //                setValor1(getResultado());
>>>>>>> 2a275440802492206790c8964a0dc3f05e02a308
    }
    
    
}
