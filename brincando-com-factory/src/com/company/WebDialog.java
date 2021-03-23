package com.company;

public class WebDialog implements Dialog {
    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
