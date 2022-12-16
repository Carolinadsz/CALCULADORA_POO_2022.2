module com.main.calculadora{
    requires javafx.controls;
    requires javafx.fxml;

    opens com.principal.cadastro.controlador;
    opens com.principal to javafx.fxml;
    exports com.principal;
    exports com.principal.login.controlador;
    exports com.principal.cadastro.controlador;
}
