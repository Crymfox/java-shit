package chapitre1;

public class UseArg {
    private String nom;
    private String prenom;
    // Constructeur par défaut
    public UseArg(String n, String p) {
        this.nom = n;
        this.prenom = p;
    }
    public String afficherNomPrenom() {
        return "Nom : " + this.nom + " / Prénom : " + this.prenom;
    }
    public static void main(String[] args) {
        UseArg u = new UseArg(args[0], args[1]);
        System.out.println(u.afficherNomPrenom());
    }
}
