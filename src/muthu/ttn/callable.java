package muthu.ttn;

import java.util.concurrent.*;

class Call implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "Hello From callable :: " + Thread.currentThread().getName();
    }
}

public class callable {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Call call = new Call();

        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<String> future = executor.submit(call);

        System.out.println(future.get());
        executor.shutdown();
    }
}


