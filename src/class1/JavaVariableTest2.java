package class1;

public class JavaVariableTest2 { // main purpose of class is , we can create a lot of objects
    public static void main(String[] args) {
        System.out.println(JavaVariableTest.age);               //Static variable/class variable , it doesnot need object , direct accessible
        JavaVariableTest javaVariableTest = new JavaVariableTest();             // left side interface , class name , parent name and right side new and class name for creating object
        System.out.println(javaVariableTest.name);                //instance create kore access korte hoe tai egula instance variable
    }
}
