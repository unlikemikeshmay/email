module javafx {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;
    requires activation;
    requires java.mail;
    opens com.test;
    opens com.test.views;
    opens com.test.controllers;
}