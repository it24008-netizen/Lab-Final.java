package AbstractClass;

public class Main {
    public static void main(String[] args) {
        Drawable d1 = new Circle(5);
        Drawable d2 = new Rectangle(4, 6);

        d1.draw();
        d2.draw();

        Shape s1 = (Shape) d1;
        Shape s2 = (Shape) d2;

        System.out.println("Circle Area: " + s1.area());
        System.out.println("Rectangle Area: " + s2.area());
    }
}