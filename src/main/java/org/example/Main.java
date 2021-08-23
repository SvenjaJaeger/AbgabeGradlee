package org.example;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

/**
 * @author svenja, m27972 u35481
 * date 2021-30-07
 * In der Main wird das Fenster geöffnet und das Programm wird gestartet
 */

public class Main extends Application {
    //LOGGING
    private final static Logger logger = LogManager.getLogger();

    //Startet das Programm
    public static void main(String[] args) {
        Configurator.setLevel(logger.getName(), Level.DEBUG);
        logger.info("Information über Nutzer");
        logger.error("einfacer Fehler");
        logger.fatal("scwerer Fehler");
        launch(args);
    }

    public static boolean isBlank(String s){
        return s == null || s.trim().isEmpty();
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
