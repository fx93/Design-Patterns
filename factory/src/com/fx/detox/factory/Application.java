package com.fx.detox.factory;

// this factory pattern is coded based on dopamine-detox sub reddit
public class Application {

    public static void main(String[] args) {
        Package aPackage=FactoryPackage.createPackage(PackageCode.INTERMEDIATE);
        System.out.println(aPackage);

        Package bPackage=FactoryPackage.createPackage(PackageCode.TIME_THEORIST);
        System.out.println(bPackage);
    }

}
