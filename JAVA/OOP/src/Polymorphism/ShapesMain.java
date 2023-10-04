package Polymorphism;

public class ShapesMain {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes shape1 = new Circle();
        Shapes shape2 = new Square();

        System.out.println(shape.name);
        System.out.println(shape1.name);
        System.out.println(shape2.name);

        shape.area();
        shape1.area();
        shape2.area();
    }
}
