import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class FooBarTest2 {
    private int n;

    public FooBarTest2(int n) {
        this.n = n;
    }

    /**
     * 信号量，保证foo和bar交替执行
     * */
    private Semaphore fooSemaphore = new Semaphore(1);
    private Semaphore barSemaphore = new Semaphore(0);

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            // printFoo.run() outputs "foo". Do not change or remove this line.
            fooSemaphore.acquire();
            printFoo.run();
            barSemaphore.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            barSemaphore.acquire();
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            fooSemaphore.release();
        }
    }
}

public class MainTest2 {
    public static void main(String[] args) {
        FooBarTest1 fooBarTest2 = new FooBarTest1(100);
        CompletableFuture.runAsync(() -> {
            try {
                fooBarTest2.foo(() -> System.out.println("foo"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        CompletableFuture.runAsync(() -> {
            try {
                fooBarTest2.bar(() -> System.out.println("bar"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}
