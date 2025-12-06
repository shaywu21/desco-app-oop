package org.example.descooperation.nusrat.technician;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class ReportViolationController
{
    @javafx.fxml.FXML
    private TextField violationLocationField;
    @javafx.fxml.FXML
    private ComboBox<String> violationTypeComboBox;
    @javafx.fxml.FXML
    private TextField customerNameTextField;
    @javafx.fxml.FXML
    private TextArea descriptionTextArea;

    @javafx.fxml.FXML
    public void initialize() {
        violationTypeComboBox.getItems().addAll(
                "Illegal Connection",
                "Meter Tampering",
                "Electricity Theft",
                "Faulty Wiring",
                "Unauthorized Load"
        );

    }

    @javafx.fxml.FXML
    public void submitButtnOnAction(ActionEvent actionEvent) {
        String name = customerNameTextField.getText().trim();
        String location = violationLocationField.getText().trim();
        String type = violationTypeComboBox.getValue();
        String description = descriptionTextArea.getText().trim();

        if (name.isEmpty() || location.isEmpty() || type == null || description.isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Validation Error", "Please fill all fields.");
            return;
        }
        if (evidenceFile == null) {
            showAlert(Alert.AlertType.ERROR, "Missing Evidence", "Please upload a photo.");
            return;
        }

    }

    @javafx.fxml.FXML
    public void uploadEvidenceButtonOnAction(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Upload Photo Evidence");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image Files", "abc", "xy", "yz")
        );
        File Selected = fileChooser.showOpenDialog(null);
        if(Selected != null){
            evidenceFile = Selected;
            showAlert(Alert.AlertType.INFORMATION, "File Upload",
                    "Evidence Selected : "+ Selected.getName());

        }


    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        sceneSwitch("/org/example/descooperation/nusrat/technician/TechnicianDashboard.fxml",
                actionEvent);
    }

    private void showAlert(Alert.AlertType type, String title, String msg){
        Alert a = new Alert(type);
        a.setTitle(title);
        a.setHeaderText(null);
        a.setContentText(msg);
        a.show();
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
}