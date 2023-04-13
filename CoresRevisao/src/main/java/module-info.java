module com.coresrevisao.coresrevisao {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.coresrevisao.coresrevisao to javafx.fxml;
    exports com.coresrevisao.coresrevisao;
}
