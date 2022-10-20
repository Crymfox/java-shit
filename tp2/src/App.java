public class App {
    public static void main(String[] args) throws Exception {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        System.out.println("Addition of x and y is " + (x + y));
        System.out.println("Subtraction of x and y is " + (x - y));
        System.out.println("Multiplication of x and y is " + (x * y));
        System.out.println("Division of x and y is " + (x / y));
    }
}
