package usageModif;
import java.util.Scanner;
import modificateur.Tapis;

public class Usage2Tapis {
    public static void main(String[] args) {
        
        // scanner object named console
        Scanner console = new Scanner(System.in);
        float longueur = console.nextFloat();
        float largeur = console.nextFloat();
        float prix = console.nextFloat();
        console.close();
        // create a new Tapis object

        Tapis tapis = new Tapis(longueur, largeur, prix);
        // print the surface of the tapis
        // System.out.println("Surface du tapis: " + tapis.calculerSurface());
        // (cette instruction ne fonctionne pas car la méthode calculerSurface() est en mode default)
        // print the price of the tapis
        // System.out.println("Prix du tapis: " + tapis.calculerPrixTapis());
        // (cette instruction ne fonctionne pas car la méthode calculerPrixTapis() est en mode protected)
    }
}
