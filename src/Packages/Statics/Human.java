package Packages.Statics;

public class Human {

    int age;
    String name;
    Integer salary;
    Boolean married;

    // use of statick keyword
    // Since population is not really related to the a particular object and is common for all objects of that class
    static long population;


    // Constructor for the class
    public Human(int age, String name, Integer salary, Boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        // to access class vairable you use class name
        Human.population += 1;
    }



}
