package chapter16;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new Hashtable<>();
            map.put( "one", 1);
            map.put( "two", 2);
            map.put( "three", 3);
            map.put("four", 4);
        System.out.println(map);

    }
}
