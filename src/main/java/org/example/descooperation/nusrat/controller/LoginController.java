package org.example.descooperation.nusrat.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController
{
    @javafx.fxml.FXML
    private ComboBox roleComboBox;
    @javafx.fxml.FXML
    private Label errorLabel;
    @javafx.fxml.FXML
    private TextField usernameTextField;
    @javafx.fxml.FXML
    private TextField passwordField;

    @javafx.fxml.FXML
    public void initialize() {
        System.out.println("LoginController: initialize");
        roleComboBox.getItems().addAll("Customer", "FieldTechnician");
    }

    @javafx.fxml.FXML
    public void loginButtonOnAction(ActionEvent actionEvent) {
        String username = usernameTextField.getText();
        String password = passwordField.getText();
        String role = roleComboBox.getValue().toString();

        if (username.isEmpty() || password.isEmpty() || role == null) {
            errorLabel.setText("Please fill all the fields");
        }
        errorLabel.setText("");

        System.out.println("Login successful with role: " + role);

    }



}