import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by manishasingh on 7/26/2017.
 */
public class Consumer  extends Thread {

    ArrayBlockingQueue<Integer> arr;

    public Consumer(ArrayBlockingQueue<Integer> arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        synchronized (arr){
        while (true) {
            if (arr.isEmpty()) {
                try {	

                    System.out.println("WAiting to consume.");
                    arr.wait();
                } catch (Exception e) {

                }
            }
            System.out.println(arr);
//            System.out.println(Thread.currentThread().getName() + " == " + arr.remove(arr.size() - 1));
            arr.notifyAll();
        }}
    }
}