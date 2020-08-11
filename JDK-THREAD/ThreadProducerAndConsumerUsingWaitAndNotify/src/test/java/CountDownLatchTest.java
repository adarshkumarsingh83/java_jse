/**
 * Created by Adarsh on 9/3/15.
 */

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

    public static void main(String... args) throws InterruptedException {
        int cnt = 10;
        CountDownLatch beginFlag = new CountDownLatch(1);
        CountDownLatch doneFlag = new CountDownLatch(cnt);

        for (int i = 0; i < cnt; ++i)
            new Thread(new Task(beginFlag, doneFlag)).start();

        showMain();
        beginFlag.countDown();
        showMain();
        doneFlag.await();

    }

    public static void showMain() {
        System.out.println("inside main method.");
    }
}

class Task implements Runnable {

    private final CountDownLatch beginFlag;
    private final CountDownLatch doneFlag;

    Task(CountDownLatch beginFlag, CountDownLatch doneFlag) {
        this.beginFlag = beginFlag;
        this.doneFlag = doneFlag;
    }

    public void run() {
        try {
            beginFlag.await();
            show();
            doneFlag.countDown();
        } catch (InterruptedException ex) {
        }
    }

    void show() {
        System.out.println("inside task.");
    }
}