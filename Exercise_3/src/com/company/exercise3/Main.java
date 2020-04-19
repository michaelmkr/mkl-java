package com.company.exercise3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lbwagnerm
 */
public class Main {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<Vehicle>(0);
        vehicles.add(new Vehicle());
        vehicles.add(new Vehicle(true, true, 10));
        vehicles.add(new Car("Toyota"));
        vehicles.add(new Car(true, true, 4, "Audi"));
        vehicles.add(new Bike("KTM"));
        vehicles.add(new Bike(false, false, 2, "Bianchi"));
        vehicles.add(new Motorbike("Ducati"));
        vehicles.add(new Motorbike(true, true, 2, "Honda"));

        vehicles.stream().forEach((Vehicle v) -> {
            System.out.println(v);
        });
    }
}














