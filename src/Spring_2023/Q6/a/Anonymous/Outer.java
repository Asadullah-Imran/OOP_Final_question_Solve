package Spring_2023.Q6.a.Anonymous;

public class Outer {
    public static void main(String[] args) {
        //code 1: create object of class Inner from Outer class
        Outer outer = new Outer();
        Outer.Inner inner= outer.new Inner();
        SampleClass s = new SampleClass();
        s.sample();
        System.out.println(inner.a);
        System.out.println(inner.b);
        //code 2: Write anonymous inner classhere
        Outer outer2 = new Outer() {
            int a = 10;
            double b = 10.0;
            void printDetails(){
                System.out.println(this.a+", "+this.b);
            }

            // You can add methods or override existing methods here
        };
        //print a and b
//        outer2.a;


    }
    class Inner{
        int a = 100;
        double b= 10.0;

    }



}


class SampleClass implements Sample{
    @Override
    public void sample(){
        System.out.println("sample is="+x);
    }
}
