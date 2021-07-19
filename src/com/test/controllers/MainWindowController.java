package com.test.controllers;

import com.test.EmailManager;
import com.test.views.ViewFactory;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeView;
import javafx.scene.web.WebView;

public class MainWindowController extends BaseController {

    @FXML
    private TreeView<?> emailsTreeView;

    @FXML
    private TableView<?> emailsTableView;

    @FXML
    private WebView emailWebView;

    public MainWindowController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        super(emailManager, viewFactory, fxmlName);
    }

    @FXML
    void addAccountAction() {
        viewFactory.showLoginWindow();
    }
    @FXML
    void optionsAction() {
        System.out.println("options");
        viewFactory.showOptionsWindow();
    }

}
