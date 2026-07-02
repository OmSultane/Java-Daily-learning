// package DSA.patterns;
import java.util.Scanner;

public class RightAngleNumber_2 {

    private static void print(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = 2;

        for(int i=0; i<t; i++){ 
            
            int n = input.nextInt();
            print(n);
        }

        input.close();

    }
}



/*

o/p :
1 
2 2
3 3 3 

*/

