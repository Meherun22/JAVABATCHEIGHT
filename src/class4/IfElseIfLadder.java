package class4;

public class IfElseIfLadder {// to fulfill two or more condition, we use logical and relational operator

    public static void main(String[] args) {
        int mark=60;

        if(mark>80 && mark <=100 ){
            System.out.println("your grade is A++");
        } else if (mark >70 && mark <=79) {
            System.out.println("your grade is A");
        } else if (mark>60 && mark <=69) {
            System.out.println("your grade is B");

        } else if (mark >40 && mark <=59) {
            System.out.println("your grade is C");
        }else {
            System.out.println("Fail");
        }


    }
}
