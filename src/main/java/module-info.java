module com.example.softwareproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.softwareproject to javafx.fxml;
    exports com.example.softwareproject;
}