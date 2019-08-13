/**
 * Created by manishasingh on 7/25/2017.
 */
public class Launcher {

    public static void main(String[] args) throws  Exception{
       Lock lock = new Lock();
        lock.lock();

        PP p = new PP(lock);
        Random r = new Random(lock);

        Thread t = new Thread(p);
        Thread t1 = new Thread(r);

        t.start();
        t1.start();

    }

    public static String ch;
    public static String pa;

    public synchronized void setChild(Launcher r) {
        r.ch = "hh";
    }

    public synchronized void setParent(Launcher r) {
        r.pa = "hh";
    }
}
