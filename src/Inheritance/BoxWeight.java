package Inheritance;

public class BoxWeight extends Box{
    public double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    BoxWeight (BoxWeight other){
        super(other); // Calls constructor of the class it's directly inherited
        weight = other.weight;
    }


    // How to initialize the values of parent clas
    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        // Super calls the parent class constructor
        this.weight = weight;
    }
}
