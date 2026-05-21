package CollectionFramework;

// import java.util.ArrayList;

// public class list {
//    public static void main(String[] args) {
        
//     ArrayList<Integer> list = new ArrayList<>();

//     list.add(10);

//     System.out.println(list.iterator());
//    } 
// }

import java.util.*;

public class list{
    
    public static void main(String[] args){
        
        // Creating a collection using ArrayList implementation
        ArrayList<Integer> numbers = new ArrayList<>(1000);
       

        // Adding individual elements
        numbers.add(10); 
        numbers.add(20);
        numbers.add(30);
        numbers.add(1, 15);  //to add number at specified index
        // Adding another collection
        Collection<Integer> moreNumbers = new ArrayList<>();
        moreNumbers.add(40);
        moreNumbers.add(50);

        numbers.addAll(moreNumbers);     //added a collection to another collection/ArrayList
        
        // System.out.println(numbers.get(3));

        numbers.set(2,25);   //to replace element element at 2nd index

        numbers.trimToSize();   //this trims the *capacity* of list according to elements

        System.out.println("After adding elements: " + numbers);
    
       numbers.ensureCapacity(100);

       System.out.println();
    
    
       List<String> anotherlist = Arrays.asList("Apple", "Bannana", "Orange");
        //we cannot add/remove elements in this type but we can set/replace elements 
       anotherlist.set(2, "om");

       System.out.println(anotherlist);




       List<Integer> list3 = List.of(1, 2, 3, 4);
       //It is the fixed list means we cannot add/remove & replace elements in this type of list and if we try to do that it throws an exception
    
       
    }
}