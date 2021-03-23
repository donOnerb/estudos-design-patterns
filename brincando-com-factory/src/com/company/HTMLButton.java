package com.company;

public class HTMLButton implements Button{
    @Override
    public void render() {
        System.out.println("eu renderizo botão de html");
    }

    @Override
    public void onClick() {
        System.out.println("eu clico no botão de html");
    }
}
