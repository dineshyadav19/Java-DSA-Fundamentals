package HashMap;

import com.sun.security.jgss.GSSUtil;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        //Insert in map
        map.put("India", 10);
        map.put("US", 20);
        map.put("UK", 30);
        map.put("Aus", 40);

        //print map
        System.out.println(map);

        //get the value of a key
        System.out.println(map.get("Aus"));

        //check if a key exist in the map
        System.out.println(map.containsKey("India"));

        //remove the key value
        map.remove("US");

        //Update the value of a key
        map.put("UK", 50);

        System.out.println(map);

        //Get the keys and print it
        Set<String> keys = map.keySet();
        for (String key: keys) {
            System.out.println(key + "-->" + map.get(key));
        }

        //way 2 of printing the keys
        for (String key: map.keySet()) {
            System.out.println(key + "--->" + map.get(key));
        }
    }
}
