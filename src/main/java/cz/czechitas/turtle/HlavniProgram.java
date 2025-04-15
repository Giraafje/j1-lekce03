package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka;

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        zofka = new Turtle();
        zofka.setPenWidth(5);
        //drawColoredSquare(100, Color.RED);
        //drawColoredBlossom(80, Color.ORANGE);
        drawPolygon(8);
    }

    public void drawColoredSquare(int sideLength, Color penColor) {
        zofka.setPenColor(penColor);
        for (int i = 0; i < 4; i++) {
            zofka.move(sideLength);
            zofka.turnLeft(90);
        }
    }

    public void drawColoredBlossom(int sideLength, Color penColor) {
        zofka.setPenColor(penColor);
        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 4; j++) {
                zofka.move(sideLength);
                zofka.turnLeft(90);
            }
            zofka.turnLeft(20);
        }
        zofka.penUp();
        zofka.move(sideLength * 2);
    }

    public void drawPolygon(int countOfAngles) {
        double sideLength = (double) 200 / countOfAngles;
        double angle = 180-(180*(1 - (double) 2 / countOfAngles));
        for (int i = 0; i < countOfAngles; i++) {
            zofka.move(sideLength);
            zofka.turnLeft(angle);
        }
    }
}
