package src;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class Ceapa extends Leguma{
    final int caloriiPer100 = 96;
    public Ceapa(int id, String nume, String culoare, String sort, int grameFolosite, double pret) throws IOException {
        super(id, nume, culoare, sort, grameFolosite, pret);
    }

    public Ceapa() {

    }

    @Override
    public double CaloriiCant() {
        double per100 = (double) grameFolosite / 100;
        return (caloriiPer100*per100);
    }

}