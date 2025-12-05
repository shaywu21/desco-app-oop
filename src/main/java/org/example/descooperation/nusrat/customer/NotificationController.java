package org.example.descooperation.nusrat.customer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.time.LocalDate;

public class NotificationController
{
    @javafx.fxml.FXML
    private TableColumn<NotificationController,String> titleCol;
    @javafx.fxml.FXML
    private TableColumn<NotificationController, LocalDate> dateCol;
    @javafx.fxml.FXML
    private TableColumn<NotificationController,String> statusCol;
    @javafx.fxml.FXML
    private TableView<NotificationController> notificationTableView;
    @javafx.fxml.FXML
    private TextArea detailsArea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void markAsReadButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void deleteButtoOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void refreshButtonOnAction(ActionEvent actionEvent) {
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