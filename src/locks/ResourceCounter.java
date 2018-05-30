package locks;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ResourceCounter {

    private int counter=0;
    //private final ReentrantLock lock = new ReentrantLock();
    ReadWriteLock lock = new ReentrantReadWriteLock();

    public int increment(){
        lock.writeLock().lock();
        try {
            counter = counter + 1;
        } finally {
            lock.writeLock().unlock();
        }

        return counter;
    }
}
