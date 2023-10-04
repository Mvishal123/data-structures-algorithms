package Inheritance;

public class ShapeMain {
    public static void main(String[] args) {
/*        Shape s1 = new Shape();
        System.out.println(s1.l + " " + s1.w + " " + s1.h);

        Shape s2 = new Shape(10);
        System.out.println(s2.l + " " + s2.w + " " + s2.h);

        Shape s3 = new Shape(s2);
        System.out.println(s3.l + " " + s3.w + " " + s3.h);*/

        ShapeProps shape1 = new ShapeProps(2, 100);
        System.out.println(shape1.w + " " + shape1.l + " " + shape1.h + " " + shape1.weight + " " + shape1.volume);

        ShapeProps shape2 = new ShapeProps(shape1);
        System.out.println(shape2.w + " " + shape2.l + " " + shape2.h + " " + shape2.weight + " " + shape2.volume);
    }
}
