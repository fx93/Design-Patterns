package com.fx.detox.factory;

public class BasicPackage extends Package {
    @Override
    protected void createPackage() {
        resistanceList.add(new DeviceResistance());
        resistanceList.add(new StimulationResistance());
    }
}
