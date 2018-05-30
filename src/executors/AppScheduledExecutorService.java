package executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class AppScheduledExecutorService {
    public static void main(String[] args) {

        Task1 task1 = new Task1();
        Task2 task2 = new Task2();

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

        scheduledExecutorService.schedule(task1, 3, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(task2, 8, TimeUnit.SECONDS);

        scheduledExecutorService.shutdown();
    }
}
