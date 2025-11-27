package org.example.descooperation.nusrat.customer;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MeterReadingReplacementController
{
    @javafx.fxml.FXML
    private TextArea notesArea;
    @javafx.fxml.FXML
    private TextField customerIdTextField;
    @javafx.fxml.FXML
    private ComboBox<String> conditionComboBox;
    @javafx.fxml.FXML
    private TextField currentReadingField;
    @javafx.fxml.FXML
    private TextField newMeterIdField;
    @javafx.fxml.FXML
    private Label successLabel;
    @javafx.fxml.FXML
    private Label errorLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
    }
}