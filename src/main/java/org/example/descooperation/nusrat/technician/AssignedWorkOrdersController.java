package org.example.descooperation.nusrat.technician;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import org.example.descooperation.nusrat.WorkOrder;

import java.time.LocalDate;

public class AssignedWorkOrdersController
{
    @javafx.fxml.FXML
    private TableColumn<WorkOrder,LocalDate> assignedDateCol;
    @javafx.fxml.FXML
    private TableColumn<WorkOrder, LocalDate> dueDateCol;
    @javafx.fxml.FXML
    private TableColumn<WorkOrder,String> statusCol;
    @javafx.fxml.FXML
    private TableColumn<WorkOrder,String> customerIdCol;
    @javafx.fxml.FXML
    private TableColumn<WorkOrder,String> workOrderIdCol;
    @javafx.fxml.FXML
    private TableView<WorkOrder> workOrderTableView;
    @javafx.fxml.FXML
    private TextField workOrderIdField;
    @javafx.fxml.FXML
    private TableColumn<WorkOrder,String> taskTypeCol;


    private Parent root;
    private Scene scene;
    private Stage stage;

    private ObservableList<WorkOrder> workOrderList = new obserableArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        workOrderIdCol.setCellValueFactory(new PropertyValueFactory<>("workOrderId"));
        customerIdCol.setCellValueFactory(new PropertyValueFactory<>("customerId"));
        taskTypeCol.setCellValueFactory(new PropertyValueFactory<>("taskType"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        dueDateCol.setCellValueFactory(new PropertyValueFactory<>("dueDate"));
        assignedDateCol.setCellValueFactory(new PropertyValueFactory<>("assignedDate"));

        loadAssignedWorkOrders();

    }

    private void loadAssignedWorkOrders(){
        workOrderList.addAll( new WorkOrder("ab","bc", "ce",
                LocalDate.now().plusDays(2),LocalDate.now().minusDays(1)),

                new WorkOrder("789","456","123",
                        LocalDate.now().plusDays(3),LocalDate.now().minusDays(2)),
                new WorkOrder("abc","xyz","mn",
                        LocalDate.now(),LocalDate.now().plusDays(5))
                );
        workOrderTableView.setItems(workOrderList);
    }

    @javafx.fxml.FXML
    public void loadWorkOrdersButtonOnAction(ActionEvent actionEvent) {
        String id = workOrderIdField.getText();
        if(id.isEmpty()){
            showError("Please enter correct id");
            return;
        }
        ObservableList<WorkOrder>filtered = workOrderList.filtered();
        if(filtered.isEmpty()){
            showError("No work order ID: " + id);

        }else {
            workOrderTableView.setItems(filtered);
        }
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
     SceneSwitch("/org/example/descooperation/nusrat/technician/FieldTechnicianDashboard.fxml", actionEvent)
    }




    @javafx.fxml.FXML
    public void acknowledgeButtonOnAction(ActionEvent actionEvent) {
        WorkOrder Selected = workOrderTableView.getSelectionModel().getSelectedItem();
        if(Selected == null){
            showError("Please select a work order acknowledge");
            return;
        }
        Selected.setStatus("Acknowledged");
        workOrderTableView.refresh();

        showInfo("Work Order" + Selected.getWorkOrderId()+ "acknowledge successfully");

    }


    @javafx.fxml.FXML
    public void viewDetailsOnAction(ActionEvent actionEvent) {
        WorkOrder selected = workOrderTableView.getSelectionModel().getSelectedItem();

        if (selected == null) {
            showError("Please select a Work Order from the table.");
            return;
        }

        showInfo("WORK ORDER DETAILS\n\n" +
                "ID: " + selected.getWorkOrderId() + "\n" +
                "Customer: " + selected.getCustomerId() + "\n" +
                "Task: " + selected.getTaskType() + "\n" +
                "Status: " + selected.getStatus());
    }

    private void showError(String s){
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setTitle("Error");
        a.setContentText(s);
        a.setHeaderText(null);
        a.show();
    }

    private void showInfo(String n){
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setHeaderText(null);
        a.setContentText(n);
        a.show();
    }

    private void SceneSwitch(String fxml, ActionEvent event){
        try{
            root = FXMLLoader.load(getClass().getResource(fxml));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}