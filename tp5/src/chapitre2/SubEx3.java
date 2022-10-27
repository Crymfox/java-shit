package chapitre2;

public abstract class SubEx3 extends Ex1 {
    // necessite un constructeur pour que la valeur de x et z soient initialisées
    public SubEx3(int x, String z) {
        super(x, z);
    }
    // il fallait appeler la méthode m1() de la classe Ex1 car elle est abstraite
    int m1(){
        return 0;
    }
    abstract void m3();
}
