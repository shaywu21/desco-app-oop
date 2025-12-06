package org.example.descooperation.nusrat.customer;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import static javafx.collections.FXCollections.observableArrayList;
import static jdk.internal.org.jline.utils.Colors.s;

public class MeterServiceController
{

    private Parent root;
    private Scene scene;
    private Stage stage;


    @javafx.fxml.FXML
    private ComboBox<String> serviceTypeComboBox;
    @javafx.fxml.FXML
    private TextField customerIdTextField;
    @javafx.fxml.FXML
    private TextField customerNameTextField;
    @javafx.fxml.FXML
    private TextField meterIdTextField;

    @javafx.fxml.FXML
    public void initialize() {
        serviceTypeComboBox.getItems().addAll(
                "Replacement - Broken",
                "Upgrade",
                "Maintenance"
        );
        serviceTypeComboBox.setPromptText("Select Service Type");

    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void submitButtonOnAction(ActionEvent actionEvent) {
        String customerId = customerIdTextField.getText();
        String customerName = customerNameTextField.getText();
        String meterId = meterIdTextField.getText();
        String serviceType = serviceTypeComboBox.getValue();


        if(customerId.isEmpty() || customerName.isEmpty() || meterId.isEmpty() ||
                serviceType == null) {
            showAlert( Alert.AlertType.ERROR,"Validation Error", "Please fill all fields and select a service type.");
            return;


            showAlert(Alert.AlertType.INFORMATION,"Success", "Meter service request submitted successfully.");
            clearFields();
    }


    }
    private void showAlert(String s, String n){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText(s);
        alert.show();

    }

    private void clearFields() {
        customerIdTextField.clear();
        customerNameTextField.clear();
        meterIdTextField.clear();
        serviceTypeComboBox.getSelectionModel().clearSelection();


    }
    private void sceneSwitch(String fxml, ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxml));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}