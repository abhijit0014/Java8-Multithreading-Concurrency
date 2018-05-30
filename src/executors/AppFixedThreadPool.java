package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AppFixedThreadPool {
    public static void main(String[] args) {

        Task1 task1 = new Task1();
        Task2 task2 = new Task2();

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(task1);
        executorService.submit(task2);

        executorService.shutdown();
    }
}
