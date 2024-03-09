package class4;

public class breakStatementTest {
    public static void main(String[] args) {
        String names[]= {"Lubaba", "raju", "afroza"};

        for (String name: names ){
            if (name=="afroza") break;
            System.out.println(name);
        }
    }
}
