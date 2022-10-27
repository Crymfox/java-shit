package chapitre2;

public interface FaireOperation {
    String t="jeu";
    // on peut modifier les variables dans l'interface mais pas les methodes
    static int multiplier(int a, int b) {
        return a*b;
    }
    default String afficher(int a, int b) {
        return t+a+b;
    }
    // les méthodes multiplier et afficher doivent être définies car elles ont un type de retour
    abstract boolean testerValeur(char c) ;
    abstract void jouer();
}