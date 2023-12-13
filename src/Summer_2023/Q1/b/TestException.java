package Summer_2023.Q1.b;

import java.util.Scanner;

public class TestException {

    public static void main(String[] args) {
        String B="";
        Scanner scan = new Scanner(System.in);
        int flag = 0;
        while(flag == 0) //so when the flag value change and not 0 then the loop will end.
        {
            System.out.println("Enter 2 integers.");
            // you have to enter two integers at first
            try{
                int a = scan.nextInt();
                //it will take input at the very first integer
                //like if you enter 23 F 56 then a will be 23
                // after 23 when compiler see a white space it will stop.

                //suppose you enter [BL 34]
                //so when it call next int it found `BL` as next int and as it is not a integer
                //it will cause a InputMismatch Exception.

                int b = Integer.parseInt(scan.nextLine().trim());
                // at first operation the cursor was after 23 like [ 23| F 56]
                //so now when you say nextLine it will take everything but newLine [\n] character
                //so my b will be now "F 56"
                //but as "F 56" is not a number so it will cause a NumberFormatException.
                int c = a/b;
                //if b becomes 0 then it will cause Arithmetic Exception
                System.out.println("Result: " + c);
                flag = 1;
            }
            catch(ArithmeticException e)
            { System.out.println("A"); }
            catch(NumberFormatException e)
            { System.out.println("C");}
            catch(Exception e)
            {
                System.out.println("B");
                //this exception will cause when it cause InputMismatch Exception
                //
                if (scan.hasNextLine())
                      scan.nextLine();
                //as for the same example in line 21
                //as getting input mismatch there is still "BL 34" in scanner
                //so when we do scan.nextLine(); it will consume the full line .
                //and thus scanner becomes clear. there will no buffer data.


            }
            finally
            {
                System.out.println("D");
                //Finally block is always print
                }
        }
        scan.close();

        System.out.println("E");
        //this block will only print when while loop will ended up
    }
}

//Enter 2 integers.
//2 e
//C
//D
//Enter 2 integers.
//e 5
//B
//D
//Enter 2 integers.
//f f
//B
//D
//Enter 2 integers.
//5 0
//A
//D
//Enter 2 integers.
//2 2
//Result: 1
//D
//E