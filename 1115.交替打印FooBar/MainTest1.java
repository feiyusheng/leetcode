import java.util.concurrent.CompletableFuture;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 这种实现会超时
 * */
class FooBarTest1 {
    private int n;

    public FooBarTest1(int n) {
        this.n = n;
    }

    Lock lock = new ReentrantLock(true);
    Lock lock2 = new ReentrantLock(true);
    boolean permitFoo = true;

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; ) {
            lock.lock();
            try {
                if (permitFoo) {
                    printFoo.run();
                    i++;
                    permitFoo = false;
                }
            } finally {
                lock.unlock();
            }
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        for (int i = 0; i < n; ) {
            lock2.lock();
            try {
                if (!permitFoo) {
                    printBar.run();
                    i++;
                    permitFoo = true;
                }
            } finally {
                lock2.unlock();
            }
        }
    }
}

public class MainTest1 {
    public static void main(String[] args) throws InterruptedException {
        FooBarTest1 fooBarTest1 = new FooBarTest1(100);
        CompletableFuture.runAsync(() -> {
            try {
                fooBarTest1.bar(() -> System.out.println("bar"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        CompletableFuture.runAsync(() -> {
            try {
                fooBarTest1.foo(() -> System.out.println("foo"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

    }
}

