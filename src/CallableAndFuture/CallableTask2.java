package CallableAndFuture;
import java.util.concurrent.Callable;

public class CallableTask2 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum=0;
        for (int i = 0; i < 5; i++) {
            sum+=i;
            Thread.sleep(2000);
        }
        return sum;
    }
}
