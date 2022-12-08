package gestionVoiture;
import java.util.Scanner;

public class VoitureFille extends Voiture {
    final void reparationVoiture() {
        System.out.println("Voiture réparée");
    }
    public static void main(String[] args) {
        VoitureFille vf = new VoitureFille();
        System.out.println(vf);
        System.out.println("matricule: ");
        Scanner sc= new Scanner(System.in);
        vf.setMatricule(sc.nextLine());
        System.out.println("marque: ");
        vf.setMatricule(sc.nextLine());
        System.out.println("puissance: ");
        vf.setPuissance(sc.nextInt());
        sc.close();
    }
}
