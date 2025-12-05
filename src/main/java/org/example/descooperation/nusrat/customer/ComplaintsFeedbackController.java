package org.example.descooperation.nusrat.customer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ComplaintsFeedbackController {

    @javafx.fxml.FXML
    private TextArea descriptionArea;

    @javafx.fxml.FXML
    private TextField complaintIdField;

    @javafx.fxml.FXML
    private ComboBox<String> complaintTypeComboBox;

    private Stage stage;
    private Scene scene;
    private Parent root;

    @javafx.fxml.FXML
    public void initialize() {
        complaintTypeComboBox.getItems().addAll(
                "Frequent Power Outages",
                "Voltage Fluctuation",
                "Billing Issue",
                "Meter Problem",
                "Service Delay",
                "Other"
        );
    }

    @javafx.fxml.FXML
    public void clearButtoonOnAction(ActionEvent actionEvent) {
        complaintIdField.clear();
        complaintTypeComboBox.getSelectionModel().clearSelection();
        descriptionArea.clear();
    }

    @javafx.fxml.FXML
    public void submitButoonOnAction(ActionEvent actionEvent) {

        String id = complaintIdField.getText();
        String type = complaintTypeComboBox.getValue();
        String desc = descriptionArea.getText();

        if (id.isEmpty()) {
            showError("Please enter a valid Customer ID.");
            return;
        }
        if (type == null) {
            showError("Please select a Complaint Type.");
            return;
        }
        if (desc.isEmpty()) {
            showError("Please write your complaint description.");
            return;
        }

        showInfo("Complaint Submitted Successfully!\n\nID: " + id + "\nType: " + type);
    }

    @javafx.fxml.FXML
    public void backButtonOnAcion(ActionEvent event) {
        changeScene("/org/example/descooperation/nusrat/customer/CustomerDashboard.fxml", event);
    }


    private void showError(String msg) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Validation Error");
        alert.setContentText(msg);
        alert.setHeaderText(null);
        alert.show();
    }

    private void showInfo(String msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setContentText(msg);
        alert.setHeaderText(null);
        alert.show();
    }

    private void changeScene(String fxml, ActionEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource(fxml));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
