package modificateur;

public class Tapis {
    //longueur float defualt access mode
    float longueur;
    //largeur float public mode
    public float largeur;
    //hauteur float protected mode
    protected float prixMetreCarre;

    //constructeur
    public Tapis(float longueur, float largeur, float prix) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.prixMetreCarre = prix;
    }

    float calculerSurface() {
        return longueur * largeur;
    }

    protected float calculerPrixTapis() {
        return calculerSurface() * prixMetreCarre;
    }

    
}
