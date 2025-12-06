package org.example.descooperation.nusrat.technician;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.time.LocalDate;

public class MeterInstallationController
{
    @javafx.fxml.FXML
    private TextField customerNameField;
    @javafx.fxml.FXML
    private ComboBox<String> meterTypeComboBox;
    @javafx.fxml.FXML
    private TextArea remarksArea;
    @javafx.fxml.FXML
    private TextField meterSerialField;
    @javafx.fxml.FXML
    private TextField workOrderIdField;
    @javafx.fxml.FXML
    private TextField addressField;
    @javafx.fxml.FXML
    private DatePicker installationDatePicker;

    @javafx.fxml.FXML
    public void initialize() {
        meterTypeComboBox.getItems().addAll("abc","def","ghi");
    }

    @javafx.fxml.FXML
    public void submitButtonOnAction(ActionEvent actionEvent) {
        String customerName = customerNameField.getText();
        String meterType = meterTypeComboBox.getValue();
        String remarks = remarksArea.getText();
        String workOrderId = workOrderIdField.getText();
        String address = addressField.getText();
        LocalDate date = installationDatePicker.getValue();

        if(customerName.isEmpty() || meterType == null ||
        remarks.isEmpty() || workOrderId.isEmpty() || address.isEmpty() ||
        date == null){
            showAlert(Alert.AlertType.ERROR, "Validation Error",
                    "Please fill all required fields.");
            return;
        }

        if(date.isAfter(LocalDate.now())){
            showAlert(Alert.AlertType.ERROR, "Invalid Date",
                    "Installation Dte Can't be future.");
            return;
        }
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        sceneSwitch("/org/example/descooperation/nusrat/technician/FieldTechnicianDashboard.fxml",actionEvent);
    }

    private void sceneSwitch(String fxml, ActionEvent actionEvent){
        try{
            Parent root = FXMLLoader.load(getClass().getResource(fxml));
            Stage stage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void showAlert(Alert.AlertType type, String s, String ms){
        Alert a = new Alert(type);
        a.setTitle(s);
        a.setHeaderText(null);
        a.setContentText(ms);
        a.show();
    }
}