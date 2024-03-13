package com.example.romeogame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage.setTitle("Romeo and Juliet Card Game");
        stage.setScene(new Scene(root, 700, 800));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
