package class3;

public class Employee {
    private int salary;
    public  String name;
    protected String id;
    public String mobileNumber;


    public Employee(){

    }

    public Employee(int salary, String name, String id, String mobileNumber) {
        this.salary = salary;
        this.name = name;
        this.id = id;
        this.mobileNumber = mobileNumber;
    }

    private void printId(){//no return type

        System.out.println("Your id is " +id);
    }//

    private int getSalary() {// has a return type

        return salary;
    }

    protected String getMobileNumber(){
        return mobileNumber;
    }
    public void  printName(String name){
        System.out.println("your name is" +name);
    }

    public static void main(String[] args) {
        Employee employee = new Employee(8000,"sona", "12", "01911293603"  );
        Bird bird =new Bird("Dove", true);
        System.out.println(bird.getName());
        System.out.println(employee.id);
        System.out.println(employee.name);
        System.out.println(employee.salary);
        System.out.println(employee.mobileNumber);



    }


}
