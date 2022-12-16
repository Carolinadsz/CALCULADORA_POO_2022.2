<<<<<<< HEAD
package com.principal.cadastro.controlador;

=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.principal.cadastro.controlador;


>>>>>>> 2a275440802492206790c8964a0dc3f05e02a308
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
<<<<<<< HEAD
import com.principal.NewFXMain;

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
=======
/**
 * @author Yasmi
 */
public class FXMLCadastroControlador implements Initializable {
    @FXML
    private TextField userNameField;
    @FXML
    private TextField userEmailField;
    @FXML
    private TextField userPhoneField;
    @FXML 
    private PasswordField userPasswordField;
    @FXML
    private PasswordField userPasswordFieldConfirmation;
    @FXML
    private TextField userAskPasswordField;
    @FXML
    private TextField userAnswerPasswordField;
    @FXML 
    private Button submitBtn;
    @FXML
    private Label errorEmailLabel;
    @FXML
    private Label errorNameLabel;
    @FXML
    private Label errorPasswordLabel;
    @FXML
    private Label errorPhoneLabel;
    @FXML
    private Label errorAskAnswerLabel;
    @FXML
    private Label shownPassword;
    @FXML
    private Label shownPasswordConfirmation;
    @FXML
    private ToggleButton toggleBtn;
    @FXML
    private ToggleButton toggleBtnConfirmation;
    @FXML
    private ImageView imgConfirmation;
    @FXML
    private ImageView img;
    
    Image openEye = new Image(getClass().getResourceAsStream("eye_open.png"));
    Image closedEye = new Image(getClass().getResourceAsStream("eye_closed.png"));
>>>>>>> 2a275440802492206790c8964a0dc3f05e02a308
    String userName;
    String userEmail;
    String userPhone;
    String userPassword;
    String userPasswordConfirmation;
<<<<<<< HEAD
    
    @FXML
    void getInfo(ActionEvent event) throws Exception {
        userName = userNameField.getText();
        nameValidation();
        
=======
    String userAskPassword;
    String userAnswerPassword;
    
    @FXML
    void getInfo(ActionEvent event) {
        userName = userNameField.getText();
        nameValidation();
       
>>>>>>> 2a275440802492206790c8964a0dc3f05e02a308
        userEmail = userEmailField.getText();
        emailValidation();
        
        userPhone = userPhoneField.getText();
        phoneValidation();
        
        userPassword = userPasswordField.getText();
        passwordValidation(userPassword);
        
        userPasswordConfirmation = userPasswordFieldConfirmation.getText();
        passwordValidation(userPasswordConfirmation);
        
<<<<<<< HEAD
        if((errorEmailLabel.getText().isEmpty() && errorNameLabel.getText().isEmpty() && errorPasswordLabel.getText().isEmpty() && errorPhoneLabel.getText().isEmpty())){
            NewFXMain change = new NewFXMain();
            change.changeScreen(1);
        }
=======
        userAskPassword = userAskPasswordField.getText();
        recoverPassword(userAskPassword);
        
        userAnswerPassword = userAnswerPasswordField.getText();
        recoverPassword(userAnswerPassword);
>>>>>>> 2a275440802492206790c8964a0dc3f05e02a308
        
    }
    
     public void nameValidation(){
        if(!userName.isEmpty()){
            notANumber();
        }
        else{
            errorNameLabel.setText("Campo 'Nome' vazio!");
        }
    }
<<<<<<< HEAD
     
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
=======
>>>>>>> 2a275440802492206790c8964a0dc3f05e02a308
    
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
    
<<<<<<< HEAD
=======
    public void recoverPassword(String recover){
        if(!recover.isEmpty()){
            errorAskAnswerLabel.setText("Campo 'Pergunta' ou/e 'Respostas' vazio(s)!");
        }
        else{
            errorAskAnswerLabel.setText("");
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
    
    
>>>>>>> 2a275440802492206790c8964a0dc3f05e02a308
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
    
<<<<<<< HEAD
    @FXML
    void setLogin(ActionEvent event) throws Exception{
        NewFXMain change = new NewFXMain();
        change.changeScreen(3);
    }
=======
>>>>>>> 2a275440802492206790c8964a0dc3f05e02a308
}
