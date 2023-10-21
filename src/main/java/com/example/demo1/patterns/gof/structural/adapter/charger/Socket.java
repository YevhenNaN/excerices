package com.example.demo1.patterns.gof.structural.adapter.charger;

public class Socket {

    public Volt getVolt(){
        return new Volt(120);
    }
}
