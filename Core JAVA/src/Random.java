/**
 * Created by manishasingh on 7/25/2017.
 */
public class Random implements  Runnable{

    Lock l;
    public Random(Lock launcher)
    {
l = launcher;
    }
    @Override
    public void run() {
        try {
            l.lock();
        }
        catch(Exception e){}
    }
}
