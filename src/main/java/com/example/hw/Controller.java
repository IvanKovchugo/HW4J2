package com.example.hw;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea chatTextField;

    @FXML
    private Button sendButton;

    @FXML
    private TextField textField;

    @FXML
    void initialize() {
        chatTextField.setEditable(false);
        sendButton.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                chatTextField.appendText(getTime() + textField.getText() + "\n");
                textField.clear();
                textField.requestFocus();

            }
        });
    }


    public void clickBtnSendText(ActionEvent actionEvent) {
        chatTextField.appendText( getTime() + textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();
    }

    public String getTime() {
        return new SimpleDateFormat("HH:mm:ss ").format(new Date());
    }

}
