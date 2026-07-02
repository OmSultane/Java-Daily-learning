import java.util.Scanner;

public class ReverseRightAngleStar {
    private static void print(int n){
        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= n-i+1; j++){
                System.out.print("* ");
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
1 2 3
1 2
1

Logic :
in every row we are printing n-i+1 ....total no.or rows - curr row no. + 1
so inner loop condition should be n-i+1

*/