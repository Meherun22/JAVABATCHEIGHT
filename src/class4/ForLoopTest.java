package class4;

public class ForLoopTest {
    public static void main(String[] args) {
        for (int i=0; i<10; i++){// for these loop only i=0
            System.out.println("print" +i);// alwayz print i=0,i=1++++++=
        }
        System.out.println("----------------------------");
        for (int i=0; i<10; ++i){//for loop
            System.out.println("print" +i);
        }
        System.out.println("----------------------------");
        for (int i=10; i>=10; --i){
            System.out.println("print" +i);
        }
        System.out.println("----------------------------");
        for (int i=20; i>=0; i--){
            //i-=3;
            System.out.println("print" +i);
            i-=3;
        }
    }
}
