package Summer_2023.Q4.a;

import java.util.ArrayList;
import java.util.Comparator;

public class Myproject4 {
    static void display(ArrayList<Student> c){
        for(int i=0;i<c.size();i++) {
            System.out.println("Name: " + c.get(i).get_name() + ", gpa =" + c.get(i).get_gpa());
        }
        System.out.println();
    }


    public static void main(String[] args) {
        ArrayList<Student> c = new ArrayList<>();
        c.add(new Student(3.5, "Elias"));
        c.add(new Student(3.2, "Sourav"));
        c.add(new Student(4.5, "Barakat"));
        c.add(new Student(2.5, "Bidu"));
        c.remove(1);
        c.set(2, new Student(3.7, "Ali"));
        c.add(1, new Student(2.95, "Hasil"));
        display(c);
        c.sort(Comparator.comparing(Student::get_gpa).reversed());
        display(c);
        double s=0;
//        for (int i =0; i < c.size(); i++) {
//            s = (s + c.get(i).get_gpa());
//        }
        for(Student stu: c){
            s+=stu.get_gpa();
        }
        s = s/c.size();
        System.out.println("average gpa = " + s);
    }

}

