package com.company.exercise3;

/**
 *
 * @author lbwagnerm
 */
public class Motorbike extends Car {

    private final String typeOfDrivingLicense;

    public Motorbike(boolean motor, boolean drivingLicense, int numberOfWheels, String type) {
        super(motor, drivingLicense, numberOfWheels, type);
        this.typeOfDrivingLicense = "category A";
    }

    public Motorbike(String type) {
        super(type);
        this.typeOfDrivingLicense = "category A";
    }
}
