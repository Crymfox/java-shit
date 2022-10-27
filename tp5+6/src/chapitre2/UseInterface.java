package chapitre2;

public class UseInterface {
    int x, y;
    static char z;

    // constructeur par défaut de la classe UseInterface
    UseInterface(int a, int b){
        x=a;
        y=b;
    }

    public boolean testerValeur(char c) {
        if (c == 0) {
            return false;
        } else return true;
    }

    public void jouer() {
        System.out.println("jouer");
    }

    // define afficher from FaireOperation
    public String afficher() {
        return FaireOperation.t+x+y;
    }
    
    public static void main(String[] args) {
        UseInterface u = new UseInterface(3, 10);
        UseInterface.z = 'y';
        System.out.println(u.testerValeur(z));
        u.jouer();
        System.out.println(FaireOperation.multiplier(u.x, u.y));
        System.out.println(u.afficher());
    }
}
