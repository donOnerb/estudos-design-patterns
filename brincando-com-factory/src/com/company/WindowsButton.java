package com.company;

public class WindowsButton implements Button {


    @Override
    public void render() {
        System.out.println("eu renderizo botão do Windows");
    }

    @Override
    public void onClick() {
        System.out.println("eu clico no botão do Windows");
    }
}
