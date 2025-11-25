module main.oop.descooperations {
    requires javafx.controls;
    requires javafx.fxml;


    opens main.oop.descooperations to javafx.fxml;
    exports main.oop.descooperations;
}