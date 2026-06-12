package CollectionFramework;
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Om");
        map.put(2, "Pranav");
        map.put(3, "Amar");
        map.put(4, "Dinesh");

        System.out.println(map);

        System.out.println(map.containsKey(3));

        

    }
}
