package Unit2;

public class MainThread1 {
    public static void main(String[] args) {
        Thread1 th=new Thread1();
        th.start();
        System.out.println(th.getName());
        th.setName("Thread1");
        System.out.println(th.getName());
        System.out.println(th.getPriority());
        th.setPriority(2);
        System.out.println(th.getPriority());
    }
}
