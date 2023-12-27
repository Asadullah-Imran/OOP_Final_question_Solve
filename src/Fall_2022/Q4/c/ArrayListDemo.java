package Fall_2022.Q4.c;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    String name;
    double height;
    Student(String name,double height){
        this.height=height;
        this.name=name;
    }
}


public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList <Student> students= new ArrayList<>();
        students.add(new Student("Redowan",5.10));
        students.add(new Student("Tawfik",5.09));
        students.add(new Student("Asad",5.10));
        students.add(new Student("Tarequl",5.06));
        students.add(new Student("Pulok",5.08));

        Comparator <Student> HeightComp= Comparator.comparing(student -> student.height);
        HeightComp=HeightComp.reversed();
        Collections.sort(students,HeightComp);

        for(Student student:students){
            System.out.println(student.height);
        }


    }

}
