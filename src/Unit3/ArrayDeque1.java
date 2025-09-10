package Unit3;

import java.util.ArrayDeque;

public class ArrayDeque1 {
    public static void main(String[] args) {
        ArrayDeque<String> que=new ArrayDeque<>();
        que.add("First");
        que.addFirst("0");
        que.addLast("Second");
        System.out.println(que);
        System.out.println(que.offerFirst("Third"));
        System.out.println(que.offerLast("Fourth"));
        System.out.println(que);
        System.out.println(que.peekFirst());
        System.out.println(que.peekLast());
    }
}
