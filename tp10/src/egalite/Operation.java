package egalite;

import java.util.Arrays;

public class Operation {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
        String[] t = new String[args.length];
        t = args.clone();
        Arrays.sort(t);
        System.out.println("t = " + Arrays.toString(t));
    }
}
