module com.example.kabaleskelet {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.kabaleskelet to javafx.fxml;
    exports com.example.kabaleskelet;
}