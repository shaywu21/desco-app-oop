package org.example.descooperation.nusrat.customer;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
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

    private String loadedCustomerId;

    @javafx.fxml.FXML
    public void initialize() {
        paymentMethodComboBox.getItems().addAll("Bkash", "Nagad", "Rocket", "Credit Card", "Debit Card");
    }

    @javafx.fxml.FXML
    public void payNowButtonOnAction(ActionEvent actionEvent) {
        if(loadedCustomerId == null){
            showError("Customer ID is null");
            return;
        }

        String method = paymentMethodComboBox.getValue();
        if (method == null) {
            showError("Please select a payment method.");
            return;
        }
        statusLabel.setText("Status: Paid");
        showInfo("Payment Successful using: " + method);
    }

    @javafx.fxml.FXML
    public void fetchBillButtonOnAction(ActionEvent actionEvent) {
        String customerId = customerIdField.getText();
        
        if (customerId.isEmpty()){
            showError("Please Enter a valid Customer ID");
            return;
        }

        if (customerId.equals("c123")){
            billingMonthLabel.setText("Billing Month : October");
            amountLabel.setText("Amount: 1000 tk");
            dueDateLabel.setText("Due Date: 1-Nov-2025");
            statusLabel.setText("Status: Unpaid");

            loadedCustomerId = customerId;

            showInfo("Bill information loaded successfully");
        }
        else{billingMonthLabel.setText("Billing Month:");
            amountLabel.setText("Amount:");
            dueDateLabel.setText("Due Date:");
            statusLabel.setText("Status:");

            loadedCustomerId = null;

            showError("No bill found for Customer ID: " + customerId);
        }
    }

    private void showError(String s) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(s);
        alert.show();
    }

    private void showInfo(String msg){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText(msg);
        alert.show();

    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        showInfo("Returning to previous screen...");
    }
}