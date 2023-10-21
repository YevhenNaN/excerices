package com.example.demo1.patterns.gof.structural.adapter.charger;

public interface SocketAdapter {

    public Volt get120Volt();

    public Volt get12Volt();

    public Volt get3Volt();
}
