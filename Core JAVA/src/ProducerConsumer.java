import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by manishasingh on 7/26/2017.
 */
public class ProducerConsumer {

    public static void main(String[] args) {

        ArrayBlockingQueue<Integer> arr = new ArrayBlockingQueue<Integer>(1200);
        Producer producer = new Producer(arr);
        Producer producer1 = new Producer(arr);

        Consumer consumer = new Consumer(arr);
        Consumer consumer1 = new Consumer(arr);

        producer.start();producer1.start();consumer.start();consumer1.start();
    }
}
