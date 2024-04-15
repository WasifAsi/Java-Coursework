package org.example.javacoursework;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;



public class HelloApplication extends Application {

    double x,y;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

//        root.setOnMousePressed(event -> {
//            x = event.getSceneX();
//            y = event.getSceneY();
//        });
//
//        root.setOnMouseDragged(event ->{
//            primaryStage.setX(event.getScreenX() - x);
//            primaryStage.setY(event.getScreenY() - y);
//        } );

        Scene scene = new Scene(root, 900, 600);

        primaryStage.setTitle("Horse Game");
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}