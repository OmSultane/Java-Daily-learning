// class recursion {
//     public int rollNo;
//     public String name;

//     recursion(int r, String n) {
//         this.rollNo = r;
//         this.name = n;
//     }

//     public static void main(String[] args) {
//         recursion[] s = new recursion[5];
        
//         s[0] = new recursion(1, "Om");
//         s[1] = new recursion(1, "Om");
//         s[2] = new recursion(1, "Om");
//         s[3] = new recursion(1, "Om");
//         s[4] = new recursion(1, "Om");
//         // s[5] = new recursion(1, "Om");


//         for(int i=0; i<s.length; i++){
//             System.out.println(s[i].rollNo);
//         }
//     }
// }

abstract class r{
    protected static int a=1;
    private static int c;

    abstract void print();
}

public class rcursion {
    
    public static void main(String[] args) {
        r.a=20;
        new rr().print();
        System.out.println(r.a);
}

class rr{
    public static int a =20;

    public void print(){
        System.out.println("hello from rr!!!");
    }
}