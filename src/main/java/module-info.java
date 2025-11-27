module org.example.descooperation {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.descooperation to javafx.fxml;
    exports org.example.descooperation;
    exports org.example.descooperation;
    opens org.example.descooperation to javafx.fxml;
    exports org.example.descooperation.nusrat;
    opens org.example.descooperation.nusrat to javafx.fxml;
    exports org.example.descooperation.nusrat.controller;
    opens org.example.descooperation.nusrat.controller to javafx.fxml;
    exports org.example.descooperation.nusrat.customer;
    opens org.example.descooperation.nusrat.customer to javafx.fxml;
}