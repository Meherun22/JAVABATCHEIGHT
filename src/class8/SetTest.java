package class8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Integer> marks = new HashSet<>();
        marks.add(89);
        marks.add(70);
        marks.add(24);
        marks.add(25);
        marks.add(90);

        System.out.println(marks.add(10));
        marks.remove(24);

        System.out.println("====================");

        for(Integer integer : marks){
            System.out.println(integer);

        }

        List<Integer> list = Arrays.asList(57,89,79);
        marks.addAll(list);

        System.out.println(marks);
    }
}
