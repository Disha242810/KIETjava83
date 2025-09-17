package Unit3;

//hashmap allows one null key and any number of null values
//No ordering is maintained in hashmap
//LinkedHashmap is a subclass of HashMap and maintains insertion order

import java.util.HashMap;
import java.util.Scanner;

public class hashMap1 {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            String key=sc.next();
            int value = sc.nextInt();
            hm.put(key,value);
        }
        for(String k: hm.keySet()){
            System.out.println(k+" "+hm.get(k));
        }
    }
}
