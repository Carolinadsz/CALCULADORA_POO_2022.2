module com.main.calculadora{
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.principal.cadastro.controlador;
    opens com.principal.login.controlador;
    opens com.principal to javafx.fxml;
    opens com.principal.imc.controlador;
    exports com.principal;
    exports com.principal.login.controlador;
    exports com.principal.cadastro.controlador;
    exports com.principal.selecao.controlador;
}
