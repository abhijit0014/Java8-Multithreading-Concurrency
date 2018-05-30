package locks;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Application {
    public static void main(String[] args) {

        ResourceCounter resourceCounter = new ResourceCounter();
        Task1 task1 = new Task1(resourceCounter);
        Task2 task2 = new Task2(resourceCounter);

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> result1 = executorService.submit(task1);
        Future<Integer> result2 = executorService.submit(task2);
        executorService.shutdown();

        try {
            System.out.println("Result 1 = "+result1.get()+" Result 2 = "+result2.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
