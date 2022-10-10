package muthu.ttn;

public class Q1runnable
{


    public static void main(String[] args) throws InterruptedException{
        Thread01 thread01ob1= new Thread01();
        Thread02 thread01ob2 =new Thread02();
        Thread03 thread01ob3 = new Thread03();
        Thread t1 = new Thread (thread01ob1);// create object for thread class, Runnable interface.// Runnable interface don't have start() method. without the start() method the runnable interface won't get executed.
        t1.start();
        Thread   t2 = new Thread(thread01ob2);
        Thread.sleep(500);
        t2.start();
        Thread t3 =new Thread(thread01ob3);
        t2.join();
        t3.start();

    }
}
