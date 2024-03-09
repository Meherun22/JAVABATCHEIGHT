package class7;

public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Dog.height);
        Dog dog = new Dog();
        dog.sound();
        dog.name="sadhafjkk";
        System.out.println(dog.name);


        System.out.println(Animal.height);
        Animal animal = new Dog();
        animal.eat();

    }
}
