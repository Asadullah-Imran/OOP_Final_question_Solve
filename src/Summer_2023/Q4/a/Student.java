package Summer_2023.Q4.a;

import java.util.ArrayList;

public class Student {
    private double gpa;
    private String name;
    public Student(double g, String n){
        gpa = g;
        name = n;
    }
    public double get_gpa(){return gpa;}
    public String get_name(){return name;}
}

class Myproject4{
    public static void main(String[] args) {
        Student s1=new Student(3.5,"Elias");
        Student s2=new Student(3.2,"Sourav");
        Student s3=new Student(4.5,"Barakat");
        Student s4=new Student(2.5,"Bidu");

        ArrayList<Student> students= new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.remove(1);
        for(Student student:students){
            System.out.println(student.get_name());
        }
    }
}

