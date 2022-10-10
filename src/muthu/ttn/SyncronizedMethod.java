package muthu.ttn;

public class SyncronizedMethod {

    public static void main(String[] args) {

        threadprint print = new threadprint();

        PrintNumberThread t1 = new PrintNumberThread(print);
        PrintNumberThread t2 = new PrintNumberThread(print);

        t1.start();
        t2.start();
    }


}
