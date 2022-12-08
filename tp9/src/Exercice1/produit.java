package Exercice1;
import java.util.Scanner;

public class produit {
    float vente;
    float fabrication;
    public produit(float vente, float fabrication) {
        this.vente = vente;
        this.fabrication = fabrication;
    }
    public void verifier() {
        if (vente > fabrication) {
            System.out.println("Le produit est rentable");
        } else {
            System.out.println("Le produit n'est pas rentable");
        }
    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Prix de vente: ");
        int vente = console.nextInt();
        System.out.print("Prix de fabrication: ");
        int fabrication = console.nextInt();
        console.close();
        produit p1 = new produit(vente, fabrication);
        p1.verifier();
    }
}
