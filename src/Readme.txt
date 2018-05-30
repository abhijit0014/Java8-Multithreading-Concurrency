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