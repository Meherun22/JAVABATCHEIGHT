package class5;

public class MultilevelInheritance {
    public static void main(String[] args) {
        PersianCat persianCat = new PersianCat();
        persianCat.color();
        persianCat.meow();
        BabyCat babyCat = new BabyCat();
        babyCat.sleep();
        babyCat.eat();
    }
}
