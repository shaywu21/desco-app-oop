package org.example.descooperation.nusrat.customer;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BillPaymentController
{
    @javafx.fxml.FXML
    private Label billingMonthLabel;
    @javafx.fxml.FXML
    private Label amountLabel;
    @javafx.fxml.FXML
    private ComboBox<String> paymentMethodComboBox;
    @javafx.fxml.FXML
    private TextField customerIdField;
    @javafx.fxml.FXML
    private Label dueDateLabel;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void payNowButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void fetchBillButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
    }
}