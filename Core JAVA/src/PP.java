/**
 * Created by manishasingh on 7/25/2017.
 */
public class PP implements Runnable{
    Lock l;
    public PP(Lock launcher)
    {
        l = launcher;
    }
    @Override
    public void run() {
        try {
            l.unlock();
        }
        catch(Exception e){}
    }
}
