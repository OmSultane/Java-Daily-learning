public class Square2 {
    // package patterns;

    public static void main(String[] args){
        
        int n = 4;
        
        printPattern(n);
    }

    private static void printPattern(int n){
        for (int i = 1; i <= n; i++) {
            
            for(int j = 1; j <= n; j++){
                System.out.print(j+ " ");
            }

            System.out.println();
        }
    }
}

/*          
                                    1 2 3 4 
                                    1 2 3 4
                                    1 2 3 4
                                    1 2 3 4
Logic:- 1.Simply run a loop to print the rows for that first determine how many rows are their
        2.Determine how many stars to print in each column 
        3.print * \ n

*/