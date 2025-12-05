module com.io.github.pedroolivsz.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.io.github.pedroolivsz.workshopjavafxjdbc to javafx.fxml;
    exports com.io.github.pedroolivsz.workshopjavafxjdbc;
}