package sample;

import javafx.application.Application;
import javafx.event.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.*;
import javafx.stage.*;
import javafx.scene.shape.*;
import javafx.scene.image.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Rectangle rect = new Rectangle();
        StackPane root = new StackPane();
        root.getChildren().add(rect);
        rect.setX(300.0/4.0);
        rect.setY(275.0/4.0);
        rect.setWidth(200);
        rect.setHeight(100);
        rect.setFill(Color.RED);
        rect.setStroke(Color.GREEN);
        rect.setStrokeWidth(50);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
