package Polymorphism;

public class Square extends Shapes{
    String name ;
    Square(){
       this.name = super.name; //refers to Shape's name
    }
    @Override
     void area(){
        System.out.println("Square: Area is square of sides");
    }
}
