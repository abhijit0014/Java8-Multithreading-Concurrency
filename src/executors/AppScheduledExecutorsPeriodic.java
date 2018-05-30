package executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class AppScheduledExecutorsPeriodic {
    public static void main(String[] args) {

        Task1 task1 = new Task1();
        Task2 task2 = new Task2();

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);

        // scheduling task to be executed every 2 seconds with an initial delay of 0 seconds
        scheduledExecutorService.scheduleAtFixedRate(task1, 0,5, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(task2, 0,10, TimeUnit.SECONDS);

        scheduledExecutorService.shutdown();
    }
}
