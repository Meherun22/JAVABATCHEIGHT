package class3;

public class Bird {
    public String  name;
    protected String color;
    int number_of_wings;
    private boolean feathers;


    public Bird(){//constructor without parameter or no argument

    }
    public Bird(String name, boolean feathers){// constructor with parameter// for passing private variable we must need constructor
        this.name=name;
        this.feathers=feathers;


    }

    public String getName() {
        return name;
    }

    public boolean isFeathers() {
        return feathers;
    }

    public static void main(String[] args) {
        Bird bird = new Bird("Dove", true);
        Employee employee = new Employee(8000,"sona", "12", "01911293603"  );
        System.out.println(employee.name);

        System.out.println(bird.getName());
        System.out.println(bird.isFeathers());


    }






}
