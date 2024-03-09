package class1;

public class LogicalOperatorTest {
    public static void main(String[] args) {
        int number1= 30, number2= 70, number3;

        System.out.println(number1>number2 && number2>number1);
        System.out.println(number1 != number2 && number2 >number1);
        System.out.println(number1!=number2 && number2>number1);

        if ((number1<number2) && (number1==number2)){
            number3= number1+number2;
            System.out.println("The sum is :" + number3);

        }
        else
            System.out.println("False condition ");




    }
}
