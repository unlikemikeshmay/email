package com.test.controllers;

import com.test.EmailManager;
import com.test.views.ViewFactory;

public abstract class BaseController {
    protected EmailManager emailManager;
    protected ViewFactory viewFactory;
    private String fxmlName;

    public BaseController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        this.emailManager = emailManager;
        this.viewFactory = viewFactory;
        this.fxmlName = fxmlName;
    }
    public String getFxmlName() {
        return fxmlName;
    }
}
