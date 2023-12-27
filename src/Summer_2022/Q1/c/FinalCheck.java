package Summer_2022.Q1.c;

class point{
    public int x, y, z;
    public point(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
public class FinalCheck {
    public static final point p = new point(1, 2, 3);
    public void FinalExam(){ // in here we must add the data return type
        System.out.println("Final is both exam and keyword");
    }
    public static void check(){
        p.x = 3;
        p.y = 4;
        //p = new point(2, 3, 4); //as the point is final so we can not initialize that
    }
    public static void main(String[] args) {
        check();
    }
}