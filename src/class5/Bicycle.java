package class5;

public class Bicycle {// Single inheritance
    public   int gear=5;
    public  int speed;

    public  void  applyBreak(int decrement){
        speed-=decrement;
        System.out.println(speed);
    }

    public void speedUp(int increment){
        speed+= increment;
        System.out.println(speed);

    }
}
