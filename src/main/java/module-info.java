module org.example.descooperation {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


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
    exports org.example.descooperation.nusrat.technician;
    opens org.example.descooperation.nusrat.technician to javafx.fxml;
}