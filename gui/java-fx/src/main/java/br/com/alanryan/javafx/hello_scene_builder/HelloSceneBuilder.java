package br.com.alanryan.javafx.hello_scene_builder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloSceneBuilder extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/br/com/alanryan/javafx/hello-scene-builder.fxml")
        );
        Scene scene = new Scene(loader.load());
        stage.setTitle("Hello Scene Builder");
        stage.setScene(scene);
        stage.show();
    }
}
