package com.example.demo1.patterns.gof.creational_patterns.singleton;

import lombok.Getter;

@Getter
public enum EnumSingleton {

    INSTANCE("Initial class info");

    private String info;

    public void setInfo(String info) {
        this.info = info;
    }

    private EnumSingleton(String info) {
        this.info = info;
    }

    public EnumSingleton getInstance() {
        return INSTANCE;
    }

    // getters and setters
}
