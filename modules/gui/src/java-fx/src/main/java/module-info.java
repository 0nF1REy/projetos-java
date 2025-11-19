module br.com.alanryan.javafx {
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

    opens br.com.alanryan.javafx to javafx.fxml;
    exports br.com.alanryan.javafx;
    exports br.com.alanryan.javafx.hello_scene_builder;
    opens br.com.alanryan.javafx.hello_scene_builder to javafx.fxml;
}