package Polymorphism;

public class Circle extends Shapes{
    String name;
    Circle(){
        this.name = "Circle";
    }
    @Override
    void area(){
        System.out.println("Circle: Area is PI*r*r");
    }
}
