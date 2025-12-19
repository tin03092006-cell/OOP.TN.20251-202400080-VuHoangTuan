module com.hust.kstn {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    opens com.hust.kstn to javafx.fxml;
    exports com.hust.kstn;
}
