package com.test.views;

import javafx.fxml.FXML;

public class First {
    int count;
    @FXML
    public void buttonAction(){
        count = count + 1;
        String stmnt;
        stmnt = String.format("What the hell, I told you not to click the button but you clicked it %s times",count);
        System.out.println(stmnt);
    }
}
