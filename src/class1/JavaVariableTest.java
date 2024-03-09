package class1;

public class JavaVariableTest {//

        String name = "fhvjvjh";//default modifier attached //instance variable, modifier can be used in front of it, it can be access from another class but , before that we need to create an object
        static int age =25;// static or class variable ,modifier can be used in front of it
public JavaVariableTest(){
    //default constructor, has no parameter
}
        { //block 1 // block can be a constructor , method
            int a =6;// local variable
            System.out.println(a);
            System.out.println(name);// instance variable can access from any block
            System.out.println(age); // static can access

        }
        { //block 2
            System.out.println(name);
           // System.out.println(a);// can not access bcz a is local variable
            System.out.println(age); //static can access

        }


    }

