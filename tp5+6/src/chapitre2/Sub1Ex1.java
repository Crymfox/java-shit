package chapitre2;

public class Sub1Ex1 extends SubEx3 {
    // necessite un constructeur pour que la valeur de x et z soient initialisées
    public Sub1Ex1(int x, String z) {
        super(x, z);
    }
    void m3() {
        System.out.println("ici m3");
    }
    int m1(int x) {
        System.out.println("ici m1");
        // il fallait retourner un int
        return x;
    }
    public static void main(String[] args) throws Exception {
        Sub1Ex1 c = new Sub1Ex1(12, "foo");
        c.m2();
    }
}
