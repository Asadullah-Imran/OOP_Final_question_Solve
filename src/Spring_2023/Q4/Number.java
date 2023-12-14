package Spring_2023.Q4;

public class Number implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<11;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Number num=new Number();
        Thread thread1=new Thread(num);
        thread1.start();
        //System.out.println(Thread.activeCount()); // to check how many thread are currntly working

        try{
            thread1.join(); //Join function means program is waiting for thread1 task completed
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Thread task completed"); //no needed just checking
    }
}
