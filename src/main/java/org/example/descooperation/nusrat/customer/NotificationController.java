package org.example.descooperation.nusrat.customer;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

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
}