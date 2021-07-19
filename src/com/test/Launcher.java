package com.test;

import com.test.views.ViewFactory;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Launcher extends Application {
    public static void main(String[] args){
        launch();
    }
    private EmailManager emailManager = new EmailManager();
    @Override
    public void start(Stage stage) throws Exception {

        ViewFactory viewFactory = new ViewFactory(emailManager);
        viewFactory.showOptionsWindow();
        viewFactory.updateStyles();
    }
}
