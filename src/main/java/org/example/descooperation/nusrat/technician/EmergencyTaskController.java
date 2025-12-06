package org.example.descooperation.nusrat.technician;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.title;

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
        taskComboBox.getItems().addAll("abc","def","xyz","mno");
        statusComboBox.getItems().addAll("A","B","C");
    }

    @javafx.fxml.FXML
    public void submitButtonOnAction(ActionEvent actionEvent) {

        if(taskComboBox.getValue() == null){
            showAlert("Error","Please select a task !", Alert.AlertType.ERROR);
            return;
        }
        if (detailsArea.getText().isEmpty()){
            showAlert("Error","Please enter task details.", Alert.AlertType.ERROR);
            return;
        }
        if (statusComboBox.getValue() == null){
            showAlert("Error","Please select task status !", Alert.AlertType.ERROR);
            return;
        }

        showAlert("Submitted",
                "Emergency Task submit successfully!\n" +
                "task : " + taskComboBox.getValue() + "\n" +
                "status:" + statusComboBox.getValue(),Alert.AlertType.INFORMATION);
    }

    @javafx.fxml.FXML
    public void uploadButtonOnAction(ActionEvent actionEvent) {
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Open Resource File");

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

    private void showAlert(String s,String n, Alert.AlertType type){
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(s);
        alert.show();

    }
}