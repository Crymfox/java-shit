package chapitre2 ;

abstract class Ex1 {
    int x ;
    String z;
    // nessecite un constructeur pour que la valeur de x et z soient initialisées
    public Ex1(int x, String z) {
        this.x = x;
        this.z = z;
    }
    abstract int m1();
    void m2() {
        int p;
        // new Ex1 object
        // Ex1 c = new Ex1();
        // on ne peut pas instancier une classe abstraite
        System.out.println(z);
        System.out.println(z.length());//affiche le nombre de caractères de z
    }
    // ajouter le modificateur final à la classe Ex1
    // final class Ex1 {
    //     int x ;
    //     String z;
    // }
    // on ne peut pas ajouter le modificateur final à une classe abstraite
}