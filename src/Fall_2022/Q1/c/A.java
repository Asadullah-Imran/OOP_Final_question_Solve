package Fall_2022.Q1.c;

public abstract class A {
    abstract void m1(A a);
}
class B extends A {
    void m1(A a){
        System.out.println("One");
    }
}
class C extends B {
    void m1(B b) {
        System.out.println("Two");
        super.m1(new B());
        System.out.println("Three");
    }
}
class Test {
    public static void main(String[] args) {
        C c = new C();
        c.m1(new B());
    }
}


//output is
//Two
//One
//Three
