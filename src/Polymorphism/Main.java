package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();

        Shapes new_Square = new Square();

        // This is polymorphism -- > ONe function takes many forms
        shape.area();
        circle.area();
        square.area();

        // This will also print the area of the square
        new_Square.area();

    }
}
