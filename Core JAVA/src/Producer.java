import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by manishasingh on 7/26/2017.
 */
public class Producer extends Thread {

    ArrayBlockingQueue<Integer> arr;

    int MAX_CAP = 1200;

    public Producer(ArrayBlockingQueue<Integer> arr) {
        this.arr = arr;
    }

    @Override
    public void run() {

        synchronized (arr){
        while (true) {
            if (MAX_CAP == arr.size()) {
                try {

                    System.out.println("Waiting to produce");
                    arr.wait();
                } catch (Exception e) {

                }
            }

            arr.add(arr.size() + 1);

            arr.notifyAll();
        }}
    }
}
