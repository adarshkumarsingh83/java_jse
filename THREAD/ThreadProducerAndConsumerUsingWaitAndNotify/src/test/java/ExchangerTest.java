/**
 * Created by Adarsh on 9/3/15.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerTest {

    Exchanger<List> exchanger = new Exchanger<>();
    List exchangeList = new ArrayList();

    class AddList implements Runnable {
        public void run() {
            try {
                while (true) {
                    exchangeList.add("1");
                    System.out.println("Adding to the Exchanger List 1");
                    if (exchangeList.size() == 1) {
                        exchangeList = exchanger.exchange(exchangeList);
                    }
                }
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }

    class SubtractList implements Runnable {
        public void run() {
            try {
                while (true) {
                    System.out.println("Removing from the Exchanger List "+exchangeList.remove("1"));
                    if (exchangeList.size() == 0) {
                        exchangeList = exchanger.exchange(exchangeList);

                    }
                }
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }

    public static void main(String... args) {

        new Thread((new ExchangerTest()).new SubtractList()).start();
        new Thread((new ExchangerTest()).new AddList()).start();
    }
}
