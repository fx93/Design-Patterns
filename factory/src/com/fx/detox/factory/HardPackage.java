package com.fx.detox.factory;

public class HardPackage extends Package {
    @Override
    protected void createPackage() {
        resistanceList.add(new MindfulResistance());
    }
}
