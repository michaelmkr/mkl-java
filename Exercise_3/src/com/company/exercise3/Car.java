package com.company.exercise3;

/**
 *
 * @author lbwagnerm
 */
public class Car extends Vehicle {
    private final String typeOfDrivingLicense;
    private final String type;

    // Insert your code here!
    
    public Car(boolean motor, boolean drivingLicense, int numberOfWheels, String type) {
        super(motor, drivingLicense, numberOfWheels);
        this.typeOfDrivingLicense = "category B";
        this.type = type;
    }

    public Car(String type) {
        super(true, true, 4);
        this.typeOfDrivingLicense = "category B";
        this.type = type;
    }

    @Override
    public String toString() {
        return "This is a vehicle of " + this.getClass() + ", having "
                + this.getNumberOfWheels() + " wheels" +
                " and has " + (this.hasMotor() ? "a motor" : "no motor") +
                " needing " + (this.needsDrivingLicense() ? "a driving license" : "no driving license") +
                (this.needsDrivingLicense() ? " of the " + this.typeOfDrivingLicense : "") +
                " it's a(n) " + this.type;
    }
    
}
