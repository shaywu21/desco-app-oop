package org.example.descooperation.nusrat.technician;

  import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.File;
import java.time.LocalDate;

public class DailyReportController
{
    @javafx.fxml.FXML
    private TextField totalAssignedField;
    @javafx.fxml.FXML
    private TextArea remarksArea;
    @javafx.fxml.FXML
    private TextField pandingtaskField;
    @javafx.fxml.FXML
    private Button uploadButton;
    @javafx.fxml.FXML
    private TextField taskCompletedField;

    @javafx.fxml.FXML
    private DatePicker datePicker;


    private File selectedFile;

    private Stage stage;
    private Parent root;
    private Scene scene;

    @javafx.fxml.FXML
    public void initialize() {
        datePicker.setValue(LocalDate.now());

    }

    @javafx.fxml.FXML
    public void submitButtonaOnAction(ActionEvent actionEvent) {

        if(datePicker.getValue()==null){
            showError("Please enter a valid date");
            return;
        }

        if(totalAssignedField.getText().isEmpty()){
            showError("Total task assigned can not be empty ");
            return;
        }

        if(taskCompletedField.getText().isEmpty()){
            showError("Task completed can not be empty ");
            return;
        }
        if(pandingtaskField.getText().isEmpty()){
            showError("Panding task completed must be selected");
            return;
        }
        int totalAssigned, taskCompleted, pending;

        try {
            totalAssigned = Integer.parseInt(totalAssignedField.getText());
            taskCompleted = Integer.parseInt(taskCompletedField.getText());
            pending = Integer.parseInt(pandingtaskField.getText());
        } catch (NumberFormatException e) {
            showError("Please enter valid numeric values.");
            return;
        }

        if (taskCompleted > totalAssigned) {
            showError("Completed tasks cannot be greater than assigned tasks.");
            return;
        }

        if (pending != (totalAssigned - taskCompleted)) {
            showError("Pending task does not match Assigned - Completed.");
            return;
        }

        if (remarksArea.getText().isEmpty()) {
            showError("Please write remarks.");
            return;
        }
        if (selectedFile == null) {
            showError("Please upload a supporting file.");
            return;
        }
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        sceneSwitch("/org/example/descooperation/nusrat/technician/FieldTechnicianDashboard.fxml", actionEvent);
    }

    private void showError(String s){
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setTitle("Error");
        a.setHeaderText(null);
        a.setContentText(s);
        a.show();
    }
    private void showInfo(String n){
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Info");
        a.setHeaderText(null);
        a.setContentText(n);
        a.show();
    }

    private void sceneSwitch(String fxml, ActionEvent event){
        try{
            Parent root = FXMLLoader.load(getClass().getResource(fxml));
            Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}