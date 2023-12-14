package Spring_2023.Q2.b;

import Summer_2023.Q2.a.Main;

class Math {
    public int divide(int a,int b) throws DivByZero{
        if(b==0){
            throw new DivByZero("The Denominator can not be zero");
        }
        return a/b;
    }
}

public class Test{
    public static void main(String[] args) {
        Math m=new Math();
        int n=4;
        int d=0;
        try{
            System.out.println( m.divide(n,d));
        }catch (DivByZero e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Complete");
        }

    }
}

class DivByZero extends ArithmeticException{
    DivByZero(String str){
        super(str);
    }

}
