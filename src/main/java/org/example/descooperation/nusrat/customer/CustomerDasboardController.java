package org.example.descooperation.nusrat.customer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class CustomerDasboardController {

    @javafx.fxml.FXML
    private Label welcomeLabel;

    private Stage stage;
    private Scene scene;
    private Parent root;

    @javafx.fxml.FXML
    public void initialize() {
        welcomeLabel.setText("Welcome to Customer Dashboard");
    }

    private void Sceneswitch(String fxmlFile, ActionEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource(fxmlFile));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void handleUsageHistory(ActionEvent actionEvent) {
        Sceneswitch("/org/example/descooperation/nusrat/customer/UsageHistory.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void handlePayBill(ActionEvent actionEvent) {
        Sceneswitch("/org/example/descooperation/nusrat/customer/BillPayment.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void handleNotificationandAlerts(ActionEvent actionEvent) {
        Sceneswitch("/org/example/descooperation/nusrat/customer/Notification.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void handleApplyMeterReplacement(ActionEvent actionEvent) {
        Sceneswitch("/org/example/descooperation/nusrat/customer/MeterReplacement.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void HandlePersonalInfo(ActionEvent actionEvent) {
        Sceneswitch("/org/example/descooperation/nusrat/customer/ProfileSettings.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void handleComplaint(ActionEvent actionEvent) {
        Sceneswitch("/org/example/descooperation/nusrat/customer/ComplaintFeedback.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void handleReportFault(ActionEvent actionEvent) {
        Sceneswitch("/org/example/descooperation/nusrat/customer/ReportFault.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void handleLogout(ActionEvent event) {
        Sceneswitch("/org/example/descooperation/login/Login.fxml", event);
    }

    @javafx.fxml.FXML
    public void handleRegisterForNewConnection(ActionEvent event) {
        Sceneswitch("/org/example/descooperation/nusrat/customer/NewConnection.fxml", event);
    }
}
