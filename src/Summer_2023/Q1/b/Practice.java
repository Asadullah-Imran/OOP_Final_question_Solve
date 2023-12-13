package Summer_2023.Q1.b;

import java.util.Scanner;

public class Practice {


//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int flag = 0;
//        while(flag == 0)
//        {
//            System.out.println("Enter 2 integers.");
//            try{
//                System.out.println("taking int 1:");
//                int a = scan.nextInt();
//                System.out.println("a: "+a);
//                System.out.println("taking int 2:");
//                int b = Integer.parseInt(scan.nextLine().trim());
//                System.out.println("b: "+b);
//                int c = a/b;
//                System.out.println("Result: " + c);
//                flag = 1;
//            }
//
//            catch(Exception e)
//            {
//                System.out.println("Enter General Exception");
//                e.printStackTrace();
//                System.out.println("B");
//
//                if (scan.hasNextLine())
//                    scan.nextLine();
//            }
//
//
//        }
//        scan.close();
//        System.out.println("E");
//    }
//


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("taking int 1:");
        int a = scan.nextInt();
        System.out.println("a: "+a);
        System.out.println("taking int 2:");
        int b = Integer.parseInt(scan.nextLine().trim());
        System.out.println("b: "+b);
        int c = a/b;
        System.out.println("Result: " + c);
        //flag = 1;
    }

}
