package ch.bbw.ls;


import java.awt.*;

public class Car {

    private String marke;
    private int hubraum;
    private Color farbe;

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public int getHubraum() {
        return hubraum;
    }

    public void setHubraum(int hubraum) {
        this.hubraum = hubraum;
    }

    public Color getFarbe() {
        return farbe;
    }

    public void setFarbe(Color farbe) {
        this.farbe = farbe;
    }

    public Car() {
        this.farbe = Color.BLACK;
    }

    public Car(String marke, int hubraum, Color farbe) {
        this.marke = marke;
        this.hubraum = hubraum;
        this.farbe = farbe;
    }

    @Override
    public String toString(){
        return "Car{" + "marke='" + this.marke + '\'' +", hubraum=" + this.hubraum + '\'' + ", farbe=" + farbe + '}';

    }

}


