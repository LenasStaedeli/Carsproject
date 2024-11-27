package ch.bbw.ls;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Car Car1 = new Car();
        Car1.setMarke("Porsche");
        System.out.println(Car1);
        System.out.println(Car1.getMarke());


        Car Car2 = new Car("Dacia duster", 2500, Color.green );

        System.out.println(Car2);


    }
}