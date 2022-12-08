package Exercice2;

import java.util.Scanner;

public class Cercle {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double getPerimetre() {
        return 2 * Math.PI * rayon;
    }

    public double getSurface() {
        return Math.PI * rayon * rayon;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Rayon = ");
        double rayon = console.nextDouble();
        console.close();
        Cercle c = new Cercle(rayon);
        System.out.println("Le périmètre est = " + c.getPerimetre());
        System.out.println("La surface est = " + c.getSurface());
    }
}
