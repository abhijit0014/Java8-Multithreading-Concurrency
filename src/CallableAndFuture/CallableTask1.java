package CallableAndFuture;

import java.util.concurrent.Callable;

public class CallableTask1 implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "Working";
    }
}
