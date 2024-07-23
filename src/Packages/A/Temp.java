package Packages.A;
// This top line denotes the location of the class in src -- > there is a folder packages inside that there is a folder A

// This is an example of packages
// THis is an example of imports in java
import static Packages.B.Message.greet;


public class Temp {


    public static void main(String[] args) {
        System.out.println("This is package A file and it will show the contents of package B");
        greet();
    }

    @Override
    public String toString() {
        return "Temp []";
    }
        

}
