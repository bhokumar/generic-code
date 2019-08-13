package ExceptionHandling;

/**
 * Created by manishasingh on 7/27/2017.
 */
public class SuppressedException implements AutoCloseable {

    /*
     If an exception is thrown from the try block and one or more exceptions are thrown from the try-with-resources statement, then those exceptions thrown from the try-with-resources statement are suppressed,
     */
    @Override
    public void close() throws Exception {
        throw new NullPointerException("Null");
    }

    public void accessResource() {
        throw new IllegalMonitorStateException("dfdsfdf");
    }

    public static void main(String[] args) {

        try {
            try (SuppressedException suppressedException = new SuppressedException();) {
                suppressedException.accessResource();
            }
        } catch (Exception e) {
            Throwable[] arr = e.getSuppressed();

            for (int idx = 0; idx < arr.length; idx++) {
                arr[idx].printStackTrace();
            }

            e.printStackTrace();
        }
    }
}
