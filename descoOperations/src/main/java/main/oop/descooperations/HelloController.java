package main.oop.descooperations;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import main.oop.descooperations.shayan.testClass;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        testClass test = new testClass();
        test.shit();
    }
}
