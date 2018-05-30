package CallableAndFuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Application {
    public static void main(String[] args) {

        CallableTask1 task1 = new CallableTask1();
        CallableTask2 task2 = new CallableTask2();

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> future1 = executorService.submit(task1);
        Future<Integer> future2 = executorService.submit(task2);

        String result1 = null;
        Integer result2 = null;

        try {
            result1 = future1.get();
            result2 = future2.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        
        System.out.println(result1);
        System.out.println(result2);
        //executorService.
        executorService.shutdown();
    }
}
