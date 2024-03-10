package class8;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put( "name", "sonoo");
        map.put( "salary", 56000);
        map.put( "married", true);
        System.out.println(map.get("salary"));
        map.remove("name");
        System.out.println(map);




    }


}
