package org.example.descooperation.nusrat.customer;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class UsageHistoryController
{
    @javafx.fxml.FXML
    private TableView<UsageHistoryController> usageTableView;
    @javafx.fxml.FXML
    private TableColumn<UsageHistoryController,Integer> unitsTableCol;
    @javafx.fxml.FXML
    private TableColumn<UsageHistoryController,Double> billTableCol;
    @javafx.fxml.FXML
    private TableColumn<UsageHistoryController,String> dateTableCol;
    @javafx.fxml.FXML
    private TableColumn<UsageHistoryController,String> statusTableCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void viewGraphButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void loadHistoryButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
    }
}