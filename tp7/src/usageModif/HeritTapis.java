package usageModif;
import modificateur.Tapis;

public class HeritTapis {
    float longueur;
    float largeur;
    float prixMetreCarre;
    void utiliserAttribute() {
        this.longueur = 5;
        this.largeur = 4;
        this.prixMetreCarre = 10;
    }
    // main method
    public static void main(String[] args) {
        HeritTapis t3 = new HeritTapis();
        t3.utiliserAttribute();
        // create a new Tapis object
        Tapis tapis = new Tapis(t3.longueur, t3.largeur, t3.prixMetreCarre);
        // print the surface of the tapis
        // System.out.println("Surface du tapis: " + tapis.calculerSurface());
        // (cette instruction ne fonctionne pas car la méthode calculerSurface() est en mode default)
        // print the price of the tapis
        // System.out.println("Prix du tapis: " + tapis.calculerPrixTapis());
        // (cette instruction ne fonctionne pas car la méthode calculerPrixTapis() est en mode protected)
    }
}
