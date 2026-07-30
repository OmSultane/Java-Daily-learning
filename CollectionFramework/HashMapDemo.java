package CollectionFramework;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Om");
        map.put(2, "Pranav");
        map.put(3, "Amar");
        map.put(4, "Dinesh");

        System.out.println(map);

        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("om"));
        
        //to acess values we can loop on keys by using KeySet
        Set<Integer> keys = map.keySet();
        for(int i : keys){
            System.out.println(map.get(i));
        }

        //we can also acess key & value using Map.Entry
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        
        for(Map.Entry<Integer, String> entry : entries){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            entry.setValue(entry.getValue().toUpperCase());
        }

        
    }
}
