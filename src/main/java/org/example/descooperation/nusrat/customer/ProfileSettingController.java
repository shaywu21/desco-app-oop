package org.example.descooperation.nusrat.customer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class ProfileSettingController
{
    @javafx.fxml.FXML
    private RadioButton genderFemaleRadionButton;
    @javafx.fxml.FXML
    private RadioButton genderMaleRadioButton;
    @javafx.fxml.FXML
    private RadioButton genderOthersRadioButton;
    @javafx.fxml.FXML
    private PasswordField passwordUpdateField;
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private TextField fullNameTextField;
    @javafx.fxml.FXML
    private TextField contactTextField;
    @javafx.fxml.FXML
    private DatePicker dobDatePicker;
    @javafx.fxml.FXML
    private TextArea addressArea;

    private ToggleGroup genderGroup;
    private Stage stage;
    private Scene scene;
    private Parent root;

    @javafx.fxml.FXML
    public void initialize() {
        genderGroup = new ToggleGroup();
        genderMaleRadioButton.setToggleGroup(genderGroup);
        genderFemaleRadionButton.setToggleGroup(genderGroup);
        genderOthersRadioButton.setToggleGroup(genderGroup);
    }

    @javafx.fxml.FXML
    public void updateButtonOnAction(ActionEvent actionEvent) {
        String name = fullNameTextField.getText();
        String email = emailTextField.getText();
        String contact = contactTextField.getText();
        String address = addressArea.getText();
        String password = passwordUpdateField.getText();

        RadioButton selectedGender = (RadioButton) genderGroup.getSelectedToggle();
        String gender = (selectedGender == null) ? null : selectedGender.getText();

        if(name.isEmpty()){
            showError("Full name cannot be empty");
            return;
        }
        if(email.isEmpty()){
            showError("Enter a valid email");
            return;
        }

        if(contact.isEmpty()){
            showError("Enter valid contact");
            return;
        }
        if(dobDatePicker.getValue() == null){
            showError("Select your date of birth");
            return;

        }
        if(gender==null){
            showError("Please fill the gender option");
            return;
        }

        showInfo("Profile Upload successfully");


    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        SceneSwitch("/org/example/descooperation/nusrat/customer/CustomerDashboard.fxml", event);
    }

    public void showError(String s){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(s);

    }
    public void showInfo(String m){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Info");
        alert.setHeaderText(null);
        alert.setContentText(m);

    }
    private void SceneSwitch(String fxml, ActionEvent event){
        try{
            root = FXMLLoader.load(getClass().getResource(fxml));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}