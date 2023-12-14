package Summer_2023.Q4.b;

public class MyThread extends Thread{
    private int tid; // Thread ID
    private int startValue, endValue, inc;
    private double z;
    public MyThread(int id, int sv, int ev){
        this.tid=id;
        this.startValue=sv;
        this.endValue=ev;
// Write your code here
        inc = 3; // increment
        z = 1.0;



    }
    public void run(){
// Write your code here to compute partial z
        //my code

        while(startValue <= endValue){
            z=z*(1.0/startValue);
            startValue+=3;
        }


    }
    public double get_z(){return z;}

}

