/**
 * Created by Adarsh on 9/3/15.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {

    final CyclicBarrier barrierTest;
    List list = new ArrayList();

    public CyclicBarrierTest() {

        barrierTest = new CyclicBarrier(3, new Runnable() {
            public void run() {
                addListValue();
            }
        });

        new Thread(new Task(1, 3)).start();
        new Thread(new Task(4, 6)).start();
        new Thread(new Task(7, 9)).start();
    }

    void add(int start, int end) {
        int sum = 0;
        for (int s = start; s <= end; s++) {
            sum += s;
        }
        list.add(sum);
        System.out.println("Per Thread Addition:" + sum);
    }

    void addListValue() {
        int total = 0;
        for (int j = 0; j < list.size(); j++) {
            total += (int) list.get(j);
        }
        System.out.println("Total addition:" + total);
    }

    class Task implements Runnable {
        int start = 0;
        int end = 0;

        Task(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public void run() {
            add(start, end);
            try {
                barrierTest.await();
            } catch (InterruptedException ex) {
                return;
            } catch (BrokenBarrierException ex) {
                return;
            }
        }
    }

    public static void main(String... args) {
        new CyclicBarrierTest();
    }
}