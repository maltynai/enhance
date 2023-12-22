module com.example.manag {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.manag to javafx.fxml;
    exports com.example.manag;
}