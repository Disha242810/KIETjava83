package Unit3;

//cannot have null key but can have null values
// implements NavigableMap interface and extends SortedMap

import java.util.Scanner;
import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, Integer> tm = new TreeMap<>();
        System.out.println("Enter the number of words:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            tm.put(word, tm.getOrDefault(word, 0) + 1);
        }
        for (String w : tm.keySet()) {
            System.out.println(w + " " + tm.get(w));
        }
    }
}
