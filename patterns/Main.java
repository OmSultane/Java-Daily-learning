public class Main extends Thread{
    
    public void run(){
        for(int i = 0; i < 5000; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) throws Exception {
        Main m1 = new Main();
        Main m2 = new Main();
        Main m3 = new Main();
 
        m1.start();
        m2.start();
        m3.start();
        
        m3.join();

        m1.join();


        m2.join();



    }
}
