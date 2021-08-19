package org.example;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author svenja, m27972 u35481
 * date 2021-30-07
 * In der Main wird das Fenster geöffnet und das Programm wird gestartet
 */

public class Main extends Application {
    //Startet das Programm
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        final Window window = new Window();
        stage.setTitle("Vier Gewinnt");
        stage.setScene(new Scene(window));
        stage.show();




    }
}

/**public class Main {
    public static void main(String[] args){
        System.out.printf("%s%n", new Main().sayHallo());
        Application.launch(FXDemo.class,args);
    }

    public String sayHallo(){
        return "Hallo Welt!";
    }
} **/
