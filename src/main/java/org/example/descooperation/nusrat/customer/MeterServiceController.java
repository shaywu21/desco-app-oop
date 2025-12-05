package org.example.descooperation.nusrat.customer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void submitButtonOnAction(ActionEvent actionEvent) {
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