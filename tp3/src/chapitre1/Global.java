package chapitre1;

public class Global {
    // Déclaration de 2 variables static a et b
    static int a;
    static int b;
    // Déclaration de 2 variables d'instance c et d
    int c;
    int d;
    // Constructeur par défaut
    public Global() {
        System.out.println("une instance Global Créée");
    }
    // Méthode d'instance
    public int useInstance() {
        this.c = 20;
        this.d = 35;
        return this.c + this.d + a + b;
    }
    // Méthode static
    public static int useStatic() {
        a = 10;
        b = 15;
        return a + b;
    }
    public static void main(String[] args) {
        // Appel de la méthode static
        System.out.println("Appel de la méthode static");
        System.out.println("a + b = " + useStatic());
        // Appel de la méthode d'instance
        System.out.println("Appel de la méthode d'instance");
        Global g = new Global();
        System.out.println("c + d + a + b = " + g.useInstance());
    }
}
