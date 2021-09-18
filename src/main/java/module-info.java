module com.example.objektivering {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.objektivering to javafx.fxml;
    exports com.example.objektivering;
}