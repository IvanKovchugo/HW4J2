module com.example.hw {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hw to javafx.fxml;
    exports com.example.hw;
}