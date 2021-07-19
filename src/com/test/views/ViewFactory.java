package com.test.views;

import com.test.EmailManager;
import com.test.controllers.BaseController;
import com.test.controllers.LoginWindowController;
import com.test.controllers.MainWindowController;
import com.test.controllers.OptionsWindowController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class ViewFactory {

    private EmailManager emailManager;
    private ArrayList<Stage> activeStages;
    public ViewFactory(EmailManager emailManager){

        this.emailManager = emailManager;
        activeStages = new ArrayList<Stage>();
    }

    //View options handling
    private ColourTheme colorTheme = ColourTheme.DARK;
    private FontSize fontSize = FontSize.MEDIUM;


    public void setColorTheme(ColourTheme colorTheme) {
        this.colorTheme = colorTheme;
    }

    public void setFontSize(FontSize fontSize) {
        this.fontSize = fontSize;
    }

    public ColourTheme getColorTheme() {
        return colorTheme;
    }

    public FontSize getFontSize() {
        return fontSize;
    }



    public void showLoginWindow(){
        System.out.println("show log in");

        BaseController controller = new LoginWindowController(emailManager,this, "LoginWindow.fxml");
        initializeStage(controller);
    }
    public void showMainWindow(){
        System.out.println("show main window");
        BaseController controller = new MainWindowController(emailManager,this,"MainWindow.fxml");


        initializeStage(controller);
    }
    public void showOptionsWindow(){
        System.out.println("options window");
        BaseController controller = new OptionsWindowController(emailManager,this,"OptionsWindow.fxml");
        initializeStage(controller);
    }

    private void initializeStage(BaseController baseController){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(baseController.getFxmlName()));
        fxmlLoader.setController(baseController);
        Parent parent;
        try {
            parent = fxmlLoader.load();
        }catch (IOException ex){
            ex.printStackTrace();
            return;
        }
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        //always have an up to date version of stage on initialization
        activeStages.add(stage);

    }
    public void closeStage(Stage stageToClose){
        stageToClose.close();
        //always remove stage when closing stage
        activeStages.remove(stageToClose);
    }
    public void updateStyles() {
        for (Stage stage: activeStages){
            Scene scene  = stage.getScene();
            // handle the css
            scene.getStylesheets().clear();
            System.out.println(colorTheme);
            System.out.println(fontSize);
            scene.getStylesheets().add(getClass().getResource(ColourTheme.getCssPath(colorTheme)).toExternalForm());
            scene.getStylesheets().add(getClass().getResource(FontSize.getFontPath(fontSize)).toExternalForm());

        }
    }
}
