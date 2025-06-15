package Inheritance;

import org.w3c.dom.ls.LSOutput;

public class Box {

    double l;
    double h;
    double w;

    Box(){
        this.l = 0;
        this.h = 0;
        this.w = 0;
    }
    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
    // Copy constructor
    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }
    public void print(){
        System.out.println("Running box");
    }


}
