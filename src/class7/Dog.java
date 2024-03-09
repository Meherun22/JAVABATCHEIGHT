package class7;

public class Dog implements Animal{

    protected  String name ="German";
    @Override
    public void eat() {
        System.out.println("DOG eats meat");// abstract method, so it forces child class to write the body

    }

    @Override
    public void sleep() {
        System.out.println("Dog sounds nine hours");

    }

    @Override
    public void move() {
        System.out.println("Dog moves night ");

    }
    public void sound(){
        System.out.println("Dog barking");
    }
}
