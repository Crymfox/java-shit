package gestionVoiture;

public class UsageVoiture {
        public static void main(String[] args) {
            int x = Integer.parseInt(args[2]);
            Voiture v = new Voiture(args[0], args[1], x);
            System.out.println(v);
            v.setMarque("Mercedes");
            System.out.println(v);
        }
}
