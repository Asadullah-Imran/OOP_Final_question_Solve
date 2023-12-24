package Spring_2022.Q1.A;

public class A {
    static final int m=10; //as it said read only once initialized
    // we also make m as static because as we put this value in static block so must be static .
    void method1(int t){
        System.out.println(t);
    }
    static void method2(){
        //access m here
        //as it has void method so we just print the m here
        System.out.println(m);
    }
}

class B extends A{
    final void method1(int t){ //set the method final so that it can not be overriden;
        System.out.println(t);
    }
}
final class C extends A{ // to stop inherit we set the class final
    void method1(int t){
        System.out.println(t);
    }
}

