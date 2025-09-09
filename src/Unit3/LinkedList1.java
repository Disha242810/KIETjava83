package Unit3;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList1();
        ll.add("First");
        ll.add("Second");
        ll.add("Third");
        ll.add("Fourth");
        Iterator itr= ll.descendingIterator();
        while (itr.hasNext())
              System.out.println(itr.next());
        ll.remove("Third");
        System.out.println(ll);
        ll.addFirst("Zero");
        ll.addLast("Fifth");
        System.out.println(ll);
    }
}

