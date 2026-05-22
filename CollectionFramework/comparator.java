/* we use comparator to sort the objects in increasing/decreasing order
to use comparator we must specify a class that *implements Comparator<T>* interface
and override the compare *(T obj, T obj)* method that takes two parameters for comparing
the logic is simply written in compare method 
if we want to sort in increasing order the value to be return must be -ve
if we want to sort in increasing order the value to be return must be -ve
summary if  [ increasing o1-o2 ]  |  if  [ decreasing o2-o1 ]   */


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
