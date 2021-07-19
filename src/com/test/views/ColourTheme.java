package com.test.views;

public enum ColourTheme {
    LIGHT,
    DEFAULT,
    DARK;

    public static String getCssPath(ColourTheme colourTheme){
        switch (colourTheme){
            case LIGHT:
                return "css/themeLight.css";
            case DEFAULT:
                return "css/themeDefault.css";
            case DARK:
                return "css/themeDark.css";
            default:
                return null;

        }
    }
}
