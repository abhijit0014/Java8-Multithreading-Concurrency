Scheduled Executors -
            ScheduledExecutorService is used to execute a task
            either periodically or after a specified delay.

shutdown() -
            when shutdown() method is called on an executor service,
            it stops accepting new tasks,
            waits for previously submitted tasks to execute,
            and then terminates the executor.

shutdownNow() -
            this method interrupts the running task and
            shuts down the executor immediately.

Callable -
            Well, Java provides a Callable interface to define tasks that return a result.
            A Callable is similar to Runnable except that
            it can return a result and throw a checked exception.

            Callable interface has a single method call()
            which is meant to contain the code that is executed by a thread.

ReentrantLock -
            ReentrantLock is a mutually exclusive lock with the same behavior
            as the intrinsic/implicit lock accessed via the synchronized keyword.

            ReentrantLock, as the name suggests, possesses reentrant characteristics.
            That means a thread that currently owns the lock can acquire it
            more than once without any problem.

ReadWriteLock
            ReadWriteLock consists of a pair of locks - one for read access and one for write access.
            The read lock may be held by multiple threads simultaneously as long as
            the write lock is not held by any thread.