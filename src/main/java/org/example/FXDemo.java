package org.example;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FXDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        final String jfx = "Hello FX";
        primaryStage.setTitle(jfx);
        Button btn = new Button();
        btn.setText("Hello");
        btn.setOnAction((event) -> Platform.exit());
        Pane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 200,100));
        primaryStage.show();
    }
}
