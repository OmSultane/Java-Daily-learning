// package patterns;

public class Square {
    public static void main(String[] args){
        
        int n =3;
        
        printPattern(n);
    }

    private static void printPattern(int n){
        for (int i = 1; i <= n; i++) {
            
            for(int j=0; j<=n; j++){
                System.out.print(n);
            }

            System.out.println();
        }
    }
}

/*          
                          ***
                          ***
                          ***
Logic:- 1.Simply run a loop to print the rows for that first determine how many rows are their
        2.Determine how many stars to print in each column 
        3.print * \ n
        
*/