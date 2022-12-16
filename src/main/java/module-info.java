module com.principal{
    requires javafx.controls;
    requires javafx.fxml;
        requires java.sql;
    opens com.principal to javafx.fxml;
    exports com.principal.db;
}
