package Unit3;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting2 {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<>();
        al.add(new Student(18, "abc", 109));
        al.add(new Student(10, "def", 100));
        al.add(new Student(21, "ghi", 203));
        al.add(new Student(22, "jkl", 605));
        Collections.sort(al);
        for(Student st: al)
            System.out.println(st.name+" "+st.age+" "+st.roll_no);
    }
}
