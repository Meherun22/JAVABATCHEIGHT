package class5;

public class SingleInheritance {
    public static void main(String[] args) {//Single inheritance
        Veloce veloce =new Veloce();
        System.out.println(veloce.gear);
        veloce.applyBreak(10);
        veloce.speedUp(10);

    }
}
