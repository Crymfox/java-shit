package egalite;

public class Tester1 {
    public static void main (String [] args){
        Integer i1 = 1000;
        Integer i2 = 1000;
        if(i1 != i2) System.out.println("objets différents "); //objets différents
        if(i1.equals(i2)) System.out.println("significativement égaux"); //significativement égaux
    }
}
