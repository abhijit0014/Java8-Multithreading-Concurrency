package locks;

import java.util.concurrent.Callable;

public class Task2 implements Callable<Integer> {

    private int result=0;
    private ResourceCounter resourceCounter;
    public Task2(ResourceCounter resourceCounter) {
        this.resourceCounter = resourceCounter;
    }

    @Override
    public Integer call() throws Exception {
        for (int i = 0; i < 200; i++) {
            result = resourceCounter.increment();
            Thread.sleep(50);
        }
        return result;
    }
}
