package org.example.descooperation.nusrat.customer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class NewConnectionController
{
    @javafx.fxml.FXML
    private TextField addressTextField;
    @javafx.fxml.FXML
    private TextField nidTextField;
    @javafx.fxml.FXML
    private TextField documentTextField;
    @javafx.fxml.FXML
    private ComboBox<String> connectionTypeComboBox;
    @javafx.fxml.FXML
    private TextField contactNoTextField;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TextField loadTextField;
    @javafx.fxml.FXML
    private Label messageLabel;

    @javafx.fxml.FXML
    public void initialize() {
        connectionTypeComboBox.getItems().addAll("ab","bc","cd");
        connectionTypeComboBox.setPromptText("Select Connection Type");

        messageLabel.setText("");
    }

    @javafx.fxml.FXML
    public void browseButtonOnAction(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open resource file");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("x","y","z"),
                new FileChooser.ExtensionFilter("w","m","n"));

        File selectedFile = fileChooser.showOpenDialog(null);
        if (selectedFile != null) {
            documentTextField.setText(selectedFile.getAbsolutePath());
    }

    @javafx.fxml.FXML

    public void submitButtonOnAction(ActionEvent actionEvent) {
            String name = nameTextField.getText();
            String nid = nidTextField.getText();
            String address = addressTextField.getText();
            String contactNo = contactNoTextField.getText();
            String load = loadTextField.getText();
            String document = documentTextField.getText();
            String connectionType = connectionTypeComboBox.getValue();

            if (name.isEmpty() || nid.isEmpty() || address.isEmpty() ||
                    contactNo.isEmpty() || load.isEmpty() || connectionType == null || document.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Validation Error", "Please fill all fields, select connection type and attach a document.");
                return;
            }

    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {

        }
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
    private void showAlert(Alert.AlertType alertType, String s, String msg){
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setTitle("Alert");
        a.setHeaderText(null);
        a.setContentText(s);
        a.show();
    }

}