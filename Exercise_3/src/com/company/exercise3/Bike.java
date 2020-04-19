package com.company.exercise3;

/**
 *
 * @author lbwagnerm
 */
public class Bike extends Car {

    public Bike(boolean motor, boolean drivingLicense, int numberOfWheels, String type) {
        super(motor, drivingLicense, numberOfWheels, type);
    }

    public Bike(String type) {
        super(false, false, 2, type);
    }

}
