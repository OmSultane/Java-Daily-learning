class aggregation extends Thread{

    public void run(){
        System.out.println("RUNNING");

       for(int i = 0; i < 10; i++){
            try{
                Thread.sleep(2000);

            }catch(InterruptedException e){
                System.out.println(e);
            }

            System.out.println(i);
       }
    }

    public static void main(String[] args) {
        
        aggregation a  = new aggregation();

        a.start();
        
    }
    
}
