package DSA.patterns;
import java.util.Scanner;

public class ReverseTriangleStar {
    private static void print(int n){
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i ; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        int t = 2;
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < 2; i++){
            int n = in.nextInt();
            print(n);             
        }
    }
}
