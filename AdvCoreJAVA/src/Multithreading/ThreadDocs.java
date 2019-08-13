package Multithreading;

public class ThreadDocs {
/**
 *  1. threadStatus - This variable keep track what is the current state of an Object. Like Running, Blocking, Started.
 *  
 *  2. yield() - 'used to prevent execution of a thread'. allow other thread to execute.
 *  
 *  3. sleep() - causes current thread to sleep. Does not release the lock.The thread
     * does not lose ownership of any monitors.
 *  
 *  4. stop() - release lock on the resource. unlock all of the monitors that it
     *       has locked.
     *       
 *  5. interrupt() - If this thread is blocked in an invocation of the {@link
     * Object#wait() wait()}, {@link Object#wait(long) wait(long)}, or {@link
     * Object#wait(long, int) wait(long, int)} methods of the {@link Object}
     * class, or of the {@link #join()}, {@link #join(long)}, {@link
     * #join(long, int)}, {@link #sleep(long)}, or {@link #sleep(long, int)},
     * methods of this class, then its interrupt status will be cleared and it
     * will receive an {@link InterruptedException}.
     * 
 
 *   6. interrupted() - The
     * <i>interrupted status</i> of the thread is cleared by this method.  In
     * other words, if this method were to be called twice in succession, the
     * second call would return false (unless the current thread were
     * interrupted again, after the first call had cleared its interrupted
     * status and before the second call had examined it).
     * 
 *   
 *   7. isInterrupted() - Tests whether this thread has been interrupted.  The <i>interrupted
     * status</i> of the thread is unaffected by this method.
     * 
 *   8. destroy() - does not release lock on monitors.
 *   
 *   9. suspend() - does not release lock on monitors.
 *   
 *   10. resume() 
 *   
 *   11. join-
 *   
 *   scheduleAtFixedRate = i need to generate report in every 1 hour then suppose first is generating at 1 then next will be at 2
 *   
 *   scheduleWithFixedDelay = i need to generate report in every 1 hour and report generation takes 20 minutes then next report will be generated 1 hour + 20 minutes.
 *   
 *   Practical use of MultiThreading - In our application we receive data packet in every two minute and after calculation we send it to gui. 
 *   
 *   Different user can ask for data for diff TS like last 1 day data, Last 4 days data. we create separate thread and send data acc.
 *   
 *   Locking - 
 *      User have some range. Range is like i will say I want to generate random numeric or alphanumeric numbers of particular length on range 1.
 */
}
