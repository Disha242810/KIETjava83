package Unit3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertyClass1 {
    public static void main(String[] args) {
        try {
            FileReader reader=new FileReader("C:\\Users\\Classic\\IdeaProjects\\JAVA83\\src\\Unit3\\db.properties");
            Properties p=new Properties();
            p.load(reader);
            Set s=p.entrySet();
            Iterator itr= s.iterator();
            while(itr.hasNext()){
                //System.out.println(itr.next());
                Map.Entry entry=(Map.Entry)itr.next();
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
//            System.out.println(p.getProperty("user"));
//            System.out.println(p.getProperty("password"));
//            System.out.println(p.getProperty("coupon"));
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
