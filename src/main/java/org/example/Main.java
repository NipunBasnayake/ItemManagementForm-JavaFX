package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/items_Management.fxml"))));
        primaryStage.show();
        primaryStage.setTitle("Item Management");
        primaryStage.setResizable(false);
        primaryStage.setX(20);
    }
}