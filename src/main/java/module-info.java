module com.main.calculadora {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.principal to javafx.fxml;
    exports com.principal;
}
