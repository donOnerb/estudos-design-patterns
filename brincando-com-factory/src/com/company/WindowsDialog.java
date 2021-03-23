package com.company;

public class WindowsDialog implements Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
