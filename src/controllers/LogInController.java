package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LogInController {
    @FXML
    private Label lblErrorMsg;

    @FXML
    private Button btnClear;

    @FXML
    private Button btnOK;

    @FXML
    private PasswordField pfPIN;

    @FXML
    private TextField tfCardNumber;

    @FXML
    void clearFields(ActionEvent event) {
        pfPIN.clear();
        tfCardNumber.clear();
    }

    @FXML
    void signIn(ActionEvent event) {
        String cardNumber = "12345";
        String PIN = "1234";

        if(pfPIN.getText().equals(PIN) && tfCardNumber.getText().equals(cardNumber)){

        }else{
            lblErrorMsg.setText("Unauthorized User!!!");
        }
    }

}

