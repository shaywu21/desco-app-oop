package org.example.descooperation.nusrat.technician;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class CustomerCompaintController
{
    @javafx.fxml.FXML
    private TableColumn<CustomerCompaintController,String> addressCol;
    @javafx.fxml.FXML
    private TableColumn<CustomerCompaintController,String> issueCol;
    @javafx.fxml.FXML
    private TableColumn<CustomerCompaintController,String> complaintIdCol;
    @javafx.fxml.FXML
    private TableColumn<CustomerCompaintController,String> customerNameCol;
    @javafx.fxml.FXML
    private TableColumn<CustomerCompaintController,String> contactNoCol;
    @javafx.fxml.FXML
    private TableView<CustomerCompaintController> complaintTableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void attendComplaintButtonOnAction(ActionEvent actionEvent) {
    }
}