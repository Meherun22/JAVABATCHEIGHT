package class5;

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Veloce veloce=new Veloce();
        System.out.println(veloce.speed);
        veloce.applyBreak(40);
        Phonix phonix =new Phonix();
        System.out.println(phonix.speed);
        phonix.speedUp(60);

    }
}
