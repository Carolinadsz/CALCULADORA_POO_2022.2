module com.principal{
    requires javafx.controls;
    requires javafx.fxml;

    opens com.principal to javafx.fxml;
    exports com.principal.db;
}
