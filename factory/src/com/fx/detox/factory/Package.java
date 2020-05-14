package com.fx.detox.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Package {

    protected List<Resistance> resistanceList = new ArrayList<>();

    public Package(){
        createPackage();
    }

    // this is the key method which lets user to create different packages
    protected abstract void createPackage();

    @Override
    public String toString() {
        return "Package( resistances " +resistanceList+ " )";
    }

}
