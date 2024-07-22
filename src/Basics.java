
class Basics {


    /**
     * sics
     */
    public static void main(String[] args) {
            System.out.println("Welcome to Basics of OOPS");


            // This is dynamic memory allocation with BY default constructor 
            // calling the default consturctor
            Student student = new Student();
            // This will give a garbage value if deafaut constructor is not set in the class


            // THis will give the values in the default constructor
            System.out.println("student = " + student.rno + student.name +student.marks);


            student.greeting();
            // THis will print as in greeting function in student 



            // Calling the dynamic constructor, Creating another constructor
            Student student2 = new Student(13, "Abhishek", 90);

            System.out.println("student2 = " + student2.rno + student2.name + student2.marks);
            

            Student student3 = new Student(student2);
            System.out.println(student3);


    }
    
    
}
class Student {

    int rno;
    String name;
    float marks;

    // Creating Default constructor

    void greeting(){
        System.out.println("Hello I am " +  this.name);
    }
    void newname(String name){
        this.name = name;
    };

    // to access the members of a class inside a function that is in the same class  "this" keyword is used
    Student() {
        this.rno = 15;
        this.name = "Jitesh Bilunia";
        this.marks = (float)88.45;

    }
    // Constructor oveloading
    Student(Student student) {
        this.rno = student.rno;
        this.name = student.name;
        this.marks = student.marks;
    }


    // Creating another constructor which can assign dynamic values
    // This is a case of constructor overloading
    Student(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;

    }
    

}

