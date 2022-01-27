import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {
    public static void main(String[] args) throws InterruptedException {
        ReentrantTask task = new ReentrantTask();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                task.firstThread();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                task.secondTest();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        task.printNumber();
    }
}

class ReentrantTask {
    public int number = 0;

    public void count() {
        for (int i = 0; i < 10000; i++) {
            number++;
        }
    }

    Lock lock = new ReentrantLock();

    public void firstThread() {
        lock.lock();
        count();
        lock.unlock();
    }

    public void secondTest() {
        lock.lock();
        count();
        lock.unlock();
    }

    public void printNumber() {
        System.out.println(number);
    }
}