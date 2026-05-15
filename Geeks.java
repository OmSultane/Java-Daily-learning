// import java.util.*;

// class first{
//     public static void main(String[] args){
        
//         // int n = 5;

//         // for(int i=1; i<=n; i++){
            
//         //     for(int j = 1; j <= n-i; j++){
                
//         //             System.out.print("  ");
//         //     }
            
//         //     for(int j=1; j <= n; j++){
                
//         //             System.out.print("* ");
//         //     }
            
//         //     System.out.println();
//         // }
        
//         int n = 5;
//         for (int i = 0; i < n; i++) {

//             for (int j = ; j>=j-i; j--) {
//                 System..print(j);
//             }
//             System.out.println();
//         }
//     }
// }



import java.util.*;

public class Geeks{

    public static void main(String[] args){
        
        // Create a PriorityQueue of Integers
        Queue<Integer> pq = new PriorityQueue<>();
        
        // Adding elements to the PriorityQueue
        pq.add(50);
        pq.add(20);
        pq.add(40);
        pq.add(10);
        pq.add(30);
        
        // Display the PriorityQueue elements
        System.out.println("PriorityQueue elements: " + pq);
    }
}