package org.example.descooperation.nusrat.technician;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FieldTechnicianDashboardController
{
    private Stage stage;
    private Scene scene;
    private Parent root;


    @javafx.fxml.FXML
    public void initialize() {

    }

    private void SceneSwitch(String fxml, ActionEvent actionEvent){
        try {
            root = FXMLLoader.load(getClass().getResource(fxml));
            stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void handleDailyReport(ActionEvent actionEvent) {
        SceneSwitch("/org/example/descooperation/nusrat/technician/DailyReport.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void handleMeterReading(ActionEvent actionEvent) {
        SceneSwitch("/org/example/descooperation/nusrat/technician/MeterReading.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void handleUpadateRepairStatus(ActionEvent actionEvent) {
        SceneSwitch("/org/example/descooperation/nusrat/technician/UpdateRepairStatus.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void handleassignedWorkOrders(ActionEvent actionEvent) {
        SceneSwitch("/org/example/descooperation/nusrat/technician/AssignedWorkOrders.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void handleEmergencyTask(ActionEvent actionEvent) {
        SceneSwitch("/org/example/descooperation/nusrat/technician/EmergencyTask.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void handleAttendcustomerComplaints(ActionEvent actionEvent) {
        SceneSwitch("/org/example/descooperation/nusrat/technician/AttendComplaints.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void handlemeterInstallationandUpdate(ActionEvent actionEvent) {
        SceneSwitch("/org/example/descooperation/nusrat/technician/MeterInstallation.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void handleLogout(ActionEvent actionEvent) {
        SceneSwitch("/org/example/descooperation/login/Login.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void handleReportViolation(ActionEvent actionEvent) {
        SceneSwitch("/org/example/descooperation/nusrat/technician/ReportViolation.fxml", actionEvent);
    }
}