package org.example.descooperation.nusrat.technician;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class EmergencyTaskController
{
    @javafx.fxml.FXML
    private ComboBox<String> statusComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> taskComboBox;
    @javafx.fxml.FXML
    private TextArea detailsArea;

    private Stage stage;
    private Scene scene;
    private Parent root;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void uploadButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        sceneSwitch("/org/example/descooperation/nusrat/technician/FieldTechnicianDashboard.fxml", actionEvent);
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