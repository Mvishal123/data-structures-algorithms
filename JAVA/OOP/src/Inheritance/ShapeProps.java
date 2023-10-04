package Inheritance;

public class ShapeProps extends Shape{
    double weight, volume;

    ShapeProps(){
        this.weight = -1;
    }

    ShapeProps(double s, double weight){
        super(s);
        this.weight = weight;
        this.volume = Math.pow(s, 3);

    }
    ShapeProps(ShapeProps old){
        super(old);
        this.weight = old.weight;
    }

    ShapeProps(double l, double w, double h, double weight){
        super(l, w, h);
        this.weight = weight;
        this.volume = l * w * h;
    }

}
