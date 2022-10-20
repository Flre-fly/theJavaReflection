module thejava.reflection {
    requires javafx.controls;
    requires javafx.fxml;


    opens thejava.reflection to javafx.fxml;
    exports thejava.reflection;
}