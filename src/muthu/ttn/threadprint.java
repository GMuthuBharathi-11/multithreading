package muthu.ttn;

public class threadprint
{
        public void print() {
            for (int i = 0; i < 5; i++) {
                synchronized (this) {
                    System.out.println(i);
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }
    }

    class PrintNumberThread extends Thread {

        threadprint print;

        PrintNumberThread(threadprint print) {
            this.print = print;
        }

        @Override
        public void run() {
            print.print();
        }
    }
