class Geeks{
    public static void main(String[] args){
        int n = 10, m = 0;

        try{
            
            System.out.println("Path: "+System.getProperty("user.dir"));
        
        }catch(ArithmeticException e){
            System.out.println("Exception of dividing a number by zero");
        
        }finally{
            System.out.println("compulsary finally block");
        }

    }
}