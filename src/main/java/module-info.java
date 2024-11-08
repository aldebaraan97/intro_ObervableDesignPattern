module org.example.observablepropertydemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.observablepropertydemo to javafx.fxml;
    exports org.example.observablepropertydemo;
}