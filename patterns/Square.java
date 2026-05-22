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



//                ***
//                ***
//                ***
