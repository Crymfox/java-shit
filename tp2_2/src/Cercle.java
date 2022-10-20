public class Cercle {
    public static final double PI = 3.14;
    public static void calculer_aire_per(double rayon){
        double aire = PI * rayon * rayon;
        double perimetre = 2 * PI * rayon;
        System.out.println("L'aire du cercle est: " + aire);
        System.out.println("Le perimetre du cercle est: " + perimetre);
    }
    public static void main(String[] args) {
        double rayon = Double.parseDouble(args[0]);
        calculer_aire_per(rayon);
    }
}
