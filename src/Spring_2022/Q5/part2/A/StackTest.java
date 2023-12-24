package Spring_2022.Q5.part2.A;



public class StackTest {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        Producer p= new Producer(s);
        Consumer c= new Consumer(s);

        //Lines of code for B
        Thread t1=new Thread(p);
        Thread t2=new Thread(c);

        t1.start();
        t2.start();

    }
}

class MyStack{
    private  int idx=0;
    private char[]data = new char[6];

    public synchronized void push(char c){
        this.notify();
        if(idx != 5){
            data[idx]=c;
            idx++;
        }
    }

    public synchronized char pop(){
        if(idx==0){
            //Lines code for A
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        idx--;
        return data[idx];

    }
}


class Producer implements Runnable{

    private MyStack stack;
    public Producer(MyStack s){
        stack=s;
    }

    public void run(){
        char c;
        for(int i=0;i<50;i++){
            c=(char)(Math.random()* 26+ 'A');
            stack.push(c);
            System.out.println("Producer: "+c);
            //Lines of code for c;
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
class Consumer implements Runnable{
    private MyStack stack;
    public Consumer(MyStack s){
        stack=s;
    }
    public void run(){
        char c;
        for(int i=0;i<50;i++){
            c=stack.pop();
            System.out.println("Consumer: "+c);
            // Lines of code for C;
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}