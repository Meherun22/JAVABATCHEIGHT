package class6;

public class Overloading {
    public void login(){
        System.out.println("please enter username & password");


    }
    public void login(String username){
        System.out.println("Enter your password");
    }
    public void login(String username, String password){
        System.out.println("login Successfully");
    }
    public void add(int number1, int number2){
        System.out.println("Summation is " +number1+number2);
    }
    public void add(int number1, int number2, int number3){
        System.out.println("Summation is " +number1+number2+number3);
    }
    public void add(){
        System.out.println("Summation " +(10+50));
    }

    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        overloading.add();
        overloading.add(90,100);
        overloading.add(20,30,40);
    }



}
