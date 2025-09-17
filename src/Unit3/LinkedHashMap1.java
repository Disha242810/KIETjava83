package Unit3;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> hm=new LinkedHashMap<>();
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

//Scanner sc=new Scanner(System.in);
//HashMap<String,Integer> hm=new HashMap<>();
//int n=sc.nextInt();
//        sc.nextLine();
//        for(int i=0; i<n; i++){
//String []query=sc.nextLine().split(" ");
//String op=query[0];
//String key=query[1];
//            if(op.equals("add")){
//        hm.put(key, hm.getOrDefault(key,0)+1);
//        }
//        else if(op.equals("count")){
//        System.out.println(hm.getOrDefault(key,0));
//        }
//        else if(op.equals("remove")){
//        if(hm.containsKey(key)){
//        if(hm.get(key)>1)
//        hm.put(key, hm.get(key)-1);
//        else
//        hm.remove(key);
//                }
//                        }