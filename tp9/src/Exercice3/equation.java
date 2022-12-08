package Exercice3;

import java.util.Scanner;

public class equation {
    float a, b, c;
    public equation(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean verifier() {
        return (a != 0);
    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Entrez a: ");
        float a = console.nextFloat();
        System.out.print("Entrez b: ");
        float b = console.nextFloat();
        System.out.print("Entrez c: ");
        float c = console.nextFloat();
        console.close();
        equation e = new equation(a, b, c);
        if (e.verifier()) {
            float delta = (float) Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("L'équation a deux solutions complexes: " + (-b / (2 * a)) + " + " + (Math.sqrt(-delta) / (2 * a)) + "i et " + (-b / (2 * a)) + " - " + (Math.sqrt(-delta) / (2 * a)) + "i");
            } else if (delta == 0) {
                System.out.println("L'équation a une solution double: " + (-b / (2 * a)));
            } else {
                System.out.println("L'équation a deux solutions: " + ((-b + Math.sqrt(delta)) / (2 * a)) + " et " + ((-b - Math.sqrt(delta)) / (2 * a)));
            }            
        } else {
            System.out.println("L'équation n'est pas du second degré");
        }
    }
}
