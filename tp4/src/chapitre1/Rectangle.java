package chapitre1;

public class Rectangle {
    //declare instance variables langueur and largeur
    public float largeur;
    public float longueur;
    //constructor
    Rectangle(float longu, float large ){
        this.largeur = large;
        this.longueur = longu;
    }
    //method to calculate rectangle's area
    public float area(){
        float area = largeur*longueur;
        return area;
    }
    //method to calculate rectangle's perimeter
    public float perimeter(){
        float perimeter = 2*(largeur* longueur);
        return perimeter;
    }
    //method to compare 2 rectangles
    public Boolean comparerRectangles(Rectangle rect1, Rectangle rect2) {
        return rect1.largeur == rect2.largeur && rect1.largeur == rect2.largeur;
    }
    //method to check if a rectangle is square
    public Boolean estCarre() {
        return this.largeur == this.longueur;
    }
    //method to return addition of 2 rectangles
    public Rectangle add(Rectangle rect1, Rectangle rect2) {
        return new Rectangle((rect1.largeur+rect2.largeur),(rect1.longueur+rect2.longueur));
    }
    //main method
    public static void main(String[] args) {
        //Create 3 instances of Rectangle
        Rectangle rectangle1 = new Rectangle(6,8);
        Rectangle rectangle2 = new Rectangle(2,2);
        //display rectangles'  perimeter and area
        System.out.printf("Le rectangle 1 à pour paramètre : %.2f pour largeur / %.2f pour longeur", rectangle1.largeur, rectangle1.longueur);
        System.out.println("Son périmètre est de " + rectangle1.perimeter());
        System.out.println("Son aire est de " + rectangle1.area());
        System.out.println("Le rectangle 2 à pour paramètre : " + rectangle2.largeur + " pour largeur " + rectangle2.longueur + " / pour longeur");
        System.out.println("Son périmètre est de " + rectangle2.perimeter());
        System.out.println("Son area est de " + rectangle2.area());
        //compare rectangle1 and rectangle2
        System.out.println(rectangle1.comparerRectangles(rectangle1,rectangle2) ? "Rectangle1 et rectangle2 sont les mêmes " : "Rectangle1 et rectangle2 sont des rectangles différents");
    }
}