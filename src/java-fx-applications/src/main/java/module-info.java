module com.example.javafxapplications {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxapplications to javafx.fxml;
    exports com.example.javafxapplications;
}