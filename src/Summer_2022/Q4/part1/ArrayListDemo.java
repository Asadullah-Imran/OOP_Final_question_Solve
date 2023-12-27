package Summer_2022.Q4.part1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    public String name;
    public int age;
    public double cgpa;
    public Student (String name,int age,double cgpa){
        this.name=name;
        this.age=age;
        this.cgpa=cgpa;
    }
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if (!(obj instanceof Student)) {
            return false;
        }
        Student student = (Student) obj;

        //return name.equals(student.name) && Integer.compare(age,student.age)==0&& Double.compare(cgpa,student.cgpa)==0;
        //this above line is for to check all the object field are equal or not
        return name.equals(student.name);
    }
    //task-a: override the eqauls method that returnss true if name of two students are equal
}


public class ArrayListDemo{
    public static void main(String[] args) {
        ArrayList<Student> alist= new ArrayList<>();
        alist.add(new Student("Sonet",15,3.8));
        alist.add(new Student("Zhang",17,3.9));
        alist.add(new Student("Buffon",20,3.6));

        Student query = new Student("Zhang", 0, 0); // this should exist in alist

        // Task-b: Properly call the contains method of the alist to find
        // whether the object query exists in it or not
        if (alist.contains(query)) {
            System.out.println("Query exists in the list.");
        } else {
            System.out.println("Query does not exist in the list.");
        }

        //task-c: write the proepr custom comparator and sort the alist using sort
        //method of the collection class
        Collections.sort(alist,new Comparator<Student>(){
            public int compare(Student s1,Student s2){
                if(s1.age>s2.age){
                    return -1;
                }else if(s1.age<s2.age){
                    return -1;
                }
                return 0;
            }
        });

        for(Student student:alist){
            System.out.println(student.name);
        }
    }
}
