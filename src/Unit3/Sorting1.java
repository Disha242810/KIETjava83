package Unit3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorting1 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(5);
        al.add(0);
        al.add(45);
        al.add(59);
        al.add(-5);
        Collections.sort(al);
        System.out.println(al);
        Collections.sort(al, Comparator.reverseOrder());
        System.out.println(al);
    }
}
