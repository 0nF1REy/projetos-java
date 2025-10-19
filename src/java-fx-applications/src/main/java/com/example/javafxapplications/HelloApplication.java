package com.example.javafxapplications;

import javafx.application.Application;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    private static String classNameToLoad;

    public static void main(String[] args) {
        if (args.length > 0) {
            classNameToLoad = args[0];
        } else {
            classNameToLoad = "com.example.javafxapplications.hello_fx.HelloFX";
        }

        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        try {
            Class<?> clazz = Class.forName(classNameToLoad);
            Application appInstance = (Application) clazz.getDeclaredConstructor().newInstance();
            appInstance.start(stage);
        } catch (ClassNotFoundException e) {
            System.err.println("Classe não encontrada: " + classNameToLoad);
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
