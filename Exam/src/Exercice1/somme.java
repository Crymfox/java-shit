package Exercice1;

import java.util.Scanner;

public class somme {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Entrez un nombre entier : ");
        int a = console.nextInt();
        console.close();
        int somme = 0;
        while (a > 0) {
            somme += a % 10;
            a /= 10;
        }
        System.out.println("La somme des chiffres est " + somme);
    }
}
