module com.example.tasks {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.tasks to javafx.fxml;
    exports com.example.tasks;
}