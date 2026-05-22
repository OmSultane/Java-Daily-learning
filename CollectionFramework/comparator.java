package CollectionFramework;
import java.util.*;


class MyComparator implements Comparator<Integer>{
    
    public int compare(Integer s1, Integer s2){
        
        return s1-s2;
    }
} 


public class comparator {
    public static void main(String[] args) {

        List<Integer> no = new ArrayList<>();
        no.add(3);
        no.add(1);
        no.add(0);
        no.add(2);

        List<String> words = Arrays.asList("bannana", "apple", "orange");
        
        no.sort(new MyComparator() );
        
        
    
    
    }
}
