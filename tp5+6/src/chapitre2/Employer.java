package chapitre2;

import java.util.Scanner;

public class Employer {
    String name, title, manager;
    public Employer(String name, String title, String manager) {
        this.name = name;
        this.title = title;
        this.manager = manager;
    }
    public String toString() {
        return "Employer: " + name + ", " + title + ", " + manager;
    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name, title, manager;
        System.out.print("Name: ");
        name = console.nextLine();
        System.out.print("Title: ");
        title = console.nextLine();
        System.out.print("Manager: ");
        manager = console.nextLine();
        console.close();
        Employer e = new Employer(name, title, manager);
        System.out.println(e);
    }
}
