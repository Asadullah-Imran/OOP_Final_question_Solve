package Summer_2023.Q4;



public class Myproject5 {
    public static void main(String[] args) {
        Thread t1 = new MyThread(1, 5, 14);
        Thread t2 = new MyThread(2, 17, 26);
        Thread t3 = new MyThread(3, 29, 38);
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        try {
            t3.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        if(!t1.isAlive() && !t2.isAlive() && !t3.isAlive()){
            double r = ((MyThread)t1).get_z();
// Write your code here to compute final z
            double r2 = ((MyThread)t2).get_z();
            double r3 = ((MyThread)t3).get_z();
            double sum=(r*r2*r3);
            System.out.println(sum);

        }
    }
}