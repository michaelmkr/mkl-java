package com.company;

public class Test {

    // Klassenvariablen von Test
    private int a = 0;
    private static int num = 0;

    //GETTER UND SETTER für a und num

    // Instanzmethoden
    public int getA() {
        return this.a;
    }
    public void setA(int a) {
        this.a = a;
    }

    // Klassenmethoden (weil num static ist und somit für die gesamte Klasse geändert wird - siehe unten)
    public static int getNum() {
        return num;
    }
    public static void setNum(int num) {
        Test.num = num;
    }



    public static void main(String[] args) {

        System.out.println("MASTERKLASSE - SEMESTER 2 - JAVA MIT MARKUS");

// ------KLASSEN UND INSTANZEN--------------------------------------------------------------------------------------------------------------------------------

        // Durch das "new Test()" wird jedes mal ein Objekt der Klasse Test erstellt -> das heißt t1, t2, t3 haben alle die Eigenschaften a und num
        // t1, t2, t3 -> Sind Objektinstanzen von der Klasse Test
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();

        // Instanzvariable a von t1, t2 und t3 verändern
        t1.setA(2);
        t2.setA(4);
        t3.setA(6);

        System.out.println("t1.a ist eine Instanzvariable mit dem Wert: " + t1.getA());
        System.out.println("t2.a ist eine Instanzvariable mit dem Wert: " + t2.getA());
        System.out.println("t3.a ist eine Instanzvariable mit dem Wert: " + t3.getA());

        System.out.println("t1.num ist eine Klassenvariable mit dem Wert: " + Test.getNum());
        System.out.println("t2.num ist eine Klassenvariable mit dem Wert: " + Test.getNum());
        System.out.println("t3.num ist eine Klassenvariable mit dem Wert: " + Test.getNum());

        // Klassenvariable num von der Klasse Test ändern
        Test.setNum(4711);
        System.out.println("t1.num ist eine Klassenvariable mit dem Wert: " + num);
        System.out.println("t2.num ist eine Klassenvariable mit dem Wert: " + num);
        System.out.println("t3.num ist eine Klassenvariable mit dem Wert: " + num);
        // Ändert also in allen Instanzen den Wert von num wenn ich nur an einer einzigen Stelle die Klassenvariable ändere

    }

}
