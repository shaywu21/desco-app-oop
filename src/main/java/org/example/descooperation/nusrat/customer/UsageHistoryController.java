package org.example.descooperation.nusrat.customer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

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

    private Parent root;
    private Stage stage;
    private Scene scene;

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