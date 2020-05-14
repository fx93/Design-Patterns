package com.fx.detox.factory;

public class FactoryPackage {

    public static Package createPackage(PackageCode packageCode){

        switch (packageCode){
            case BEGINNER:
                return new BasicPackage();
            case INTERMEDIATE:
                return new MediumPackage();
            case TIME_THEORIST:
                return new HardPackage();
            default:
                return null;

        }

    }
}
