package chapitre1;

/**
*c’est un essai d’utilisation de commentaire Javadoc
*@author Sameur Ben Hmouda
*@since 13/10/2022
*/

public class EssaiJD {
    int b;

    /** methode calculer
    * @param a
    * @return retourne le cube de a
    */

    int calculer(int a){
        return a*a*a;
    }

    /** methode modifier
    * @param b1
    * valeur pour modifier b
    */

    void modifier(int b1){
        b=b1;
    }
}
