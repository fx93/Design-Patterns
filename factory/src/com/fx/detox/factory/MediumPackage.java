package com.fx.detox.factory;

public class MediumPackage extends Package {
    @Override
    protected void createPackage() {
        resistanceList.add(new LeisureResistance());
        resistanceList.add(new SocialResistance());
    }
}
