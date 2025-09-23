package Unit2;

public class Thread2 extends Thread{
    public void run(){
        for(int i=1; i<10; i+=2){
            try{
                Thread.sleep(9000);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println(i);
        }
    }
}
