package gestionVoiture;

public class Voiture {
    private String matricule, marque;
    private int puissance;
    public Voiture(String mt, String mq, int p) {
        matricule = mt;
        marque = mq;
        puissance = p;
    }
    public Voiture() {}
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public String toString() {
        return "Voiture [matricule=" + matricule + ", marque=" + marque + ", puissance=" + puissance + "]";
    }


}
