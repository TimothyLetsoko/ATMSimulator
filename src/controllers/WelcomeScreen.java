package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class WelcomeScreen implements Initializable {

    @FXML
    private Label lblDate;

    @FXML
    void deposit() {

    }

    @FXML
    void exit() {

    }

    @FXML
    void options() {

    }

    @FXML
    void printStatement() {

    }

    @FXML
    void showBalance() {

    }

    @FXML
    void withdraw() {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        lblDate.setText(localDateTime.format(dateTimeFormatter));
    }
}
