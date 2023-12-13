package Summer_2023.Q1.a;

public abstract class Student {
    String firstName, lastName, studentID;
    int age;
    Student(String firstName,String lastName,String studentID,int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.studentID=studentID;
        this.age=age;
    }
    abstract void register();
    public void display(){
        System.out.println("First Name: "+firstName);
        System.out.println("last Name: "+lastName);
        System.out.println("Student Id: "+studentID);
        System.out.println("Age: "+age);
    }
}
