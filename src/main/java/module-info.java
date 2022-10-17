module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.task2 to javafx.fxml;
    exports com.example.task2;
}