package Packages.StaticVariables;

public class StaticBlock {

    static int a = 3;
    static int b = 4;
    int c = 5;


    // Static blocks
    static{

            System.out.println("INside static block");
            b = a+6;
            // This will not work 
            // c = 2*a;
    }

    public static void main(String[] args) {

        StaticBlock obj = new StaticBlock();
        System.out.println(a + " "+ b);


        // change b
        b += 3;

        StaticBlock obj2 = new StaticBlock();
        
        System.out.println(a +" "+ b);
        // Static block is only run once after object is createds
        
    }
    


}
