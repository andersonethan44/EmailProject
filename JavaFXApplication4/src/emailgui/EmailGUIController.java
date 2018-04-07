/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailgui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author Ethan
 */
public class EmailGUIController implements Initializable
{
    
    @FXML
    private Label label;
    @FXML
    private TextArea body;
    @FXML
    private TextField subject;
    @FXML
    private TextField recipient;
    @FXML
    private Button button;
    @FXML
    private TextField password;
    @FXML
    private TextField userName;
    
    @FXML
    private void handleButtonAction(ActionEvent event)
    {
        System.out.println(body.getText());
        System.out.println(subject.getText());
        System.out.println(recipient.getText());
        String[] recipients= new String[1];
        recipients[0] = recipient.getText();
        SMTP.sendFromGMail(userName.getText(), password.getText(), recipients, subject.getText(), body.getText());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }    
    
}
