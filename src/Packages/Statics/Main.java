package Packages.Statics;

import static Packages.B.Message.greet;

public class Main {

    public static void main(String[] args) {
        Human kunal = new Human('0', null, null, null);
        Human jitesh = new Human(0, null, null, null);

        System.out.println(Human.population);
        System.out.println(kunal.population);

    }


    // Since this is static method we not need objects to call this
    static void fun(){

        // This will not work as greet is non-static
        // we cam access only static methods inside static methods
        // greet();
        // If we want to call      
        
        Main obj = new Main();
        obj.greet();


    }

    void fun2(){
        // This will work without creatin object as fun2 is non-static and we can access any type of method via fun2
            fun();
            // THis will also work since greet is non - static
            greet();
    }


    void greet(){
            System.out.println("Hello this is a non-static method");
    }

    // creating a non static method


}
