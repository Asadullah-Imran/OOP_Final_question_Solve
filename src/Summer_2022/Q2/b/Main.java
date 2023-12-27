package Summer_2022.Q2.b;

import java.util.Scanner;

class InvalidUserException extends Exception{
    InvalidUserException(String str){
        super(str);
    }
}

class ExceptionDemo {
    void UserCheck(int age, int work_experience ) throws
            InvalidUserException{
        // Write your answer for (ii). here.

        if(age<50){
            throw new InvalidUserException("Ineligible for Elderly pension because of age");
        }
        if (work_experience<20) {
            throw new InvalidUserException("“Ineligible for Elderly pension because of work experience");
        }

    }
}

public class Main {
    public static void main(String args[]) {
        ExceptionDemo obj = new ExceptionDemo();
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        int work_experience = input.nextInt();
        // Write your answer for (iii). here.
        try{

        obj.UserCheck(age, work_experience);
        }catch (InvalidUserException e){
            System.out.println("Caught the Exception: "+e.getMessage());
        }
    }
}

