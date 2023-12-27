package Fall_2022.Q1.b;

public abstract class abs {
    abstract public void m1();
    public void m2(){}
}
interface I1{                           //it is not "Interface" but "interface"
public void m3();
public void m4();
        }
interface I2{                           //it is not "Interface" but "interface"
public void m5();
//public void m6();                       //m6() method shold not be write
        }
class Abstraction extends abs implements I1, I2{
    public void m1(){};
    public void m3(){};
    public void m4(){};
    public void m5(){};
}
