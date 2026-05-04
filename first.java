import java.util.*;

class first{
    public static void main(String[] args){
        int x,y,z;
        Scanner in = new Scanner(System.in);

        
            System.out.println("Enter three numbers: ");
            x = in.nextInt();
            y = in.nextInt();
            z = in.nextInt();

            if(x>y){
                if(x>z)
                    System.out.println(x+" is greater");
                else 
                    System.out.println(y+" is greater");
            }else{
                if(y>z)
                    System.out.println(y+" is greatest");
                else
                    System.out.println(z+" is greatest");
            }

        
    }
}