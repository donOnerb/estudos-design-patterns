package com.company;

public interface Dialog {
    default void render() {
        var button = createButton();
        button.onClick();
        button.render();
    }

    Button createButton();
}
