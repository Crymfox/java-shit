package Exercice2;

import java.util.Scanner;

public class date {
    int annee, mois, jour;
    public date(int annee, int mois, int jour) {
        this.annee = annee;
        this.mois = mois;
        this.jour = jour;
    }
    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public void setJour(int jour) {
        this.jour = jour;
    }

    public void display() {
        System.out.println("La date est: " + jour + "/" + mois + "/" + annee);
    }

    public static boolean bissextile(int annee) {
        if (annee % 4 == 0) {
            if (annee % 100 == 0) {
                if (annee % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Entrez l'année: ");
        int annee = console.nextInt();
        System.out.print("Entrez le mois: ");
        int mois = console.nextInt();
        System.out.print("Entrez le jour: ");
        int jour = console.nextInt();
        console.close();
        date d1 = new date(annee, mois, jour);
        d1.display();
        System.out.println(bissextile(annee));
    }
}
