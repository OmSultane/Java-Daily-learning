package CollectionFramework;
import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        // Node node1 = new Node();

        // node1.value = 10;
        // node1.next = null;

        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(50);
        linkedList.add(60);
        linkedList.add(70);
        linkedList.add(90);
        linkedList.add(50);

        
        //to add element at last of lineked list
        linkedList.addLast(60);
        
        //to add element at first of lineked list
        linkedList.addFirst(40);
        
        // to acess element via index
        System.out.println( linkedList.get(3) ); 
        
        // to acess last element of linkedlist
        System.out.println( linkedList.getLast() ); 

        // to acess first element of linkedlist
        System.out.println( linkedList.getFirst() );
        
        linkedList.getFirst();

    }
}

// class Node{
//     public int value;

//     public Node next = null;
// }