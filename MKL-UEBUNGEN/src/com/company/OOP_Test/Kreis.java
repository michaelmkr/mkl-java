package com.company.OOP_Test;

import java.util.concurrent.TimeUnit;

/**
 * @author MichaelMkr
 * created on 28.03.2020
 * package: com.company.OOP_Test
 */

public class Kreis {

    private static final float PI = 3.1415926f;
    private static int numberOfInstances = 0;

    static {
        numberOfInstances = 100;
    }


    private float radius = -1.0f;

    public Kreis() {
        this(0.0f);
    }

    public Kreis(float radius) {
        this.radius = Math.max(radius, 0.0f);
        numberOfInstances += 1;
    }

    public static void main(String[] args) throws InterruptedException {

        Kreis k1 = new Kreis();
        k1.setRadius(0815.0f);
        System.out.println("Radius von k1: " + k1.getRadius());
        System.out.println("Derzeit angelegte Instanzen: " + Kreis.numberOfInstances);

        Kreis k2 = new Kreis(47.11f);
        System.out.println("Radius von k2: " + k2.getRadius());
        System.out.println("Derzeit angelegte Instanzen: " + Kreis.numberOfInstances);
        System.out.println("Fläche von k2: " + k2.getFlaeche());


        k2 = null;
        System.out.println("k2 wird zerstört -> k2 = null;");
        System.gc();

        TimeUnit.SECONDS.sleep(2);

        System.out.println("Derzeit angelegte Instanzen: " + Kreis.numberOfInstances);

    }

    public static int getNumberOfInstances() {
        return numberOfInstances;
    }

    public float getFlaeche() {
        return this.radius * this.radius + PI;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        numberOfInstances -= 1;

    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

}
