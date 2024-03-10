package class8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();// wild card, type is definable

        marks.add(89);
        marks.add(70);
        marks.add(24);
        marks.add(25);
        marks.add(90);

        for(Integer integer : marks){
            System.out.println(integer);

        }

        System.out.println(marks.get(0));
        marks.remove(0);

        System.out.println("==========================");

        for(Integer integer : marks){
            System.out.println(integer);

        }
        System.out.println("=========================");
        marks.add(0,99);

        List<Integer> list = Arrays.asList(57,89,79);
        marks.addAll(list);

        System.out.println(marks);

        marks.removeAll(list);
        System.out.println("==============");
        for (Integer integer : marks){
            System.out.println(integer);
        }

        List<Object> objects =new ArrayList<>();
        objects.add(353);
        objects.add(34.9);
        objects.add("gddg");




    }
}
