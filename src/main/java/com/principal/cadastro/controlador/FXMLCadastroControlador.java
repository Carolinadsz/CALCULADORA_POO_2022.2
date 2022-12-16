package com.principal.cadastro.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * @author Yasmi
 */

public class FXMLCadastroControlador implements Initializable {
    @FXML
    protected TextField userNameField;
    @FXML
    protected TextField userEmailField;
    @FXML
    protected TextField userPhoneField;
    @FXML 
    protected PasswordField userPasswordField;
    @FXML
    protected PasswordField userPasswordFieldConfirmation;
    @FXML 
    protected Button submitBtn;
    @FXML
    protected Label errorEmailLabel;
    @FXML
    protected Label errorNameLabel;
    @FXML
    protected Label errorPasswordLabel;
    @FXML
    protected Label errorPhoneLabel;
    @FXML
    protected Label errorAskAnswerLabel;
    @FXML
    protected Label shownPassword;
    @FXML
    protected Label shownPasswordConfirmation;
    @FXML
    protected ToggleButton toggleBtn;
    @FXML
    protected ToggleButton toggleBtnConfirmation;
    @FXML
    protected ImageView imgConfirmation;
    @FXML
    protected ImageView img;
    
    Image openEye = new Image(getClass().getResourceAsStream("/com/principal/cadastro/imagem/eye_open.png"));
    Image closedEye = new Image(getClass().getResourceAsStream("/com/principal/cadastro/imagem/eye_closed.png"));
    String userName;
    String userEmail;
    String userPhone;
    String userPassword;
    String userPasswordConfirmation;
    
    @FXML
    void getInfo(ActionEvent event) {
        userName = userNameField.getText();
       
        userEmail = userEmailField.getText();
        emailValidation();
        
        userPhone = userPhoneField.getText();
        phoneValidation();
        
        userPassword = userPasswordField.getText();
        passwordValidation(userPassword);
        
        userPasswordConfirmation = userPasswordFieldConfirmation.getText();
        passwordValidation(userPasswordConfirmation);
        
    }
    
     public void nameValidation(){
        if(!userName.isEmpty()){
            notANumber();
        }
        else{
            errorNameLabel.setText("Campo 'Nome' vazio!");
        }
    }
     
    public void notANumber(){
        for (int i = 0; i<userName.length(); i++){
            if(Character.isDigit(userName.charAt(i))){
                errorNameLabel.setText("Campo 'Nome' não pode conter números!");
                break;
            }
            else{
                errorNameLabel.setText("");
            }
            
        }
    }
    
    public void emailValidation(){
        if(!userEmail.isEmpty()){
            if(!userEmail.contains("@")){
                errorEmailLabel.setText("Email inválido!");                
            }
            else{
                errorEmailLabel.setText("");
            }
        }
        
        else{
            errorEmailLabel.setText("Campo 'Email' vazio!");
        }
    }
    
    public void phoneValidation(){
        if(!userPhone.isEmpty()){
            if(userPhone.length() != 11){
                errorPhoneLabel.setText("Número de telefone inválido!");
            }
            else {
                for (int i = 0; i<userPhone.length(); i++){
                    if(Character.isLetter(userPhone.charAt(i))){
                        errorPhoneLabel.setText("Campo 'Telefone' não pode conter letras!");
                        break;
                    }
                    else{
                         errorPhoneLabel.setText("");
                    }
                }
            }
        }
        else{
            errorPhoneLabel.setText("Campo 'Telefone' vazio!");
        }
}

    
    public void passwordValidation(String userVariable){
        if(!userVariable.isEmpty()){
            Boolean isEqual = (userPassword == null ? userPasswordConfirmation == null : userPassword.equals(userPasswordConfirmation));
            if(isEqual){
                errorPasswordLabel.setText("");
            }
            else{
                errorPasswordLabel.setText("Senha e confirmação de senha precisam que seus valores sejam iguais!");
            }
        }
        else{
             errorPasswordLabel.setText("Campo 'Senha' ou/e 'Confirmação de senha' vazio(s)!");
        }
    }
    
    @FXML
    void seePassword(ActionEvent e){
        if(toggleBtn.isSelected()){
            shownPassword.setVisible(true);
            shownPassword.textProperty().bind(Bindings.concat(userPasswordField.getText()));
            img.setImage(openEye);
        }
        else{
            img.setImage(closedEye);
            shownPassword.setVisible(false);
            userPasswordField.setVisible(true);
        }
    }
    
    public void keyReleased(Event event) {
        shownPassword.textProperty().bind(Bindings.concat(userPasswordField.getText()));
    }
    
    @FXML
    void seePasswordConfirmation(ActionEvent e){
        if(toggleBtnConfirmation.isSelected()){
            shownPasswordConfirmation.setVisible(true);
            shownPasswordConfirmation.textProperty().bind(Bindings.concat(userPasswordFieldConfirmation.getText()));
            imgConfirmation.setImage(openEye);
        }
        else{
            imgConfirmation.setImage(closedEye);
            shownPasswordConfirmation.setVisible(false);
            userPasswordFieldConfirmation.setVisible(true);
        }
    }
    
    public void keyReleasedConfirmation(Event event) {
        shownPasswordConfirmation.textProperty().bind(Bindings.concat(userPasswordFieldConfirmation.getText()));
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        shownPassword.setVisible(false);
        shownPasswordConfirmation.setVisible(false);
    }    
    
}
