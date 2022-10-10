package muthu.ttn;
public class Q1extends
{
    public static void main(String[] args) throws InterruptedException
    {
        Thread1 threadob1 = new Thread1();// create a object for Thread1 class
        Thread2 threadob2 = new Thread2();// create a object for Thread2 class
        Thread3 threadob3 = new Thread3();// create a object for Thread3 class
        threadob1.start();
        threadob1.join();//thread1 will not finish until thread2 has completed.
        threadob2.start();
        threadob2.join();
        Thread.sleep(5000);//thread will pause for 50 sec, then will go to the thread3.
        threadob3.start();
    }

}
