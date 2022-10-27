package chapitre2;

import java.util.Scanner;

public class Essai {
    public static void main(String[] args) throws Exception {
        // // premier question
        // Scanner console = new Scanner(System.in);
        // System.out.print("Ecrire: ");
        // String s = console.nextLine();
        // System.out.println(s);
        // console.close();
        
        // // deuxieme question
        // Scanner console = new Scanner(System.in);
        // while (true) {
        //     System.out.print("Ecrire: ");
        //     String s = console.nextLine();
        //     if (s.equals("ok")) {
        //         break;
        //     }
        // }
        // console.close();

        // troisieme question
        Scanner console = new Scanner(System.in);
        System.out.print("Ecrire: ");
        int n = console.nextInt();
        System.out.println(n);
        console.close();
    }
}
