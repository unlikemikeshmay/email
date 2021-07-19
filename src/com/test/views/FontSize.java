package com.test.views;

public enum FontSize {
    SMALL,
    MEDIUM,
    LARGE;

    public static String getFontPath(FontSize fontSize){
        switch (fontSize){
            case LARGE:
                return "css/fontBig.css";
            case MEDIUM:
                return "css/fontMedium.css";
            case SMALL:
                return "css/fontSmall.css";
            default:
                return null;
        }
    }
}
