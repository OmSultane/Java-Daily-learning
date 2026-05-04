public class recursion{
    int c = 0;
    void print(){
        
        if(c>5){
            System.out.println("Om");
            ++c;
            return;
        }
        print();
    }

    public static void main(String[] args){
        
        recursion r = new recursion();
        r.print();
    }
}