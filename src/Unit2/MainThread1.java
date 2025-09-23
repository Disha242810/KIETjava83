package Unit2;

public class MainThread1 {
    public static void main(String[] args) {
        Thread1 th=new Thread1();
        Thread2 th2=new Thread2();
        th.start();
        th2.start();
//        System.out.println(th.getName());
//        th.setName("Thread1");
//        System.out.println(th.getName());
//        System.out.println(th.getPriority());
//        th.setPriority(2);
//        System.out.println(th.getPriority());
    }
}
