package Inheritance;

public class Shape {
    double l;
    double w;
    double h;

    Shape(){
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    Shape(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }

    Shape(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Shape(Shape old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void process(){
        System.out.println("Creating the shape. Appreciate your patience");
    }
}
