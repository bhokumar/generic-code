package ExceptionHandling;

/**
 * Created by manishasingh on 7/26/2017.
 */
public class ExceptionHandler {

    public int tt() throws ArrayIndexOutOfBoundsException {
        String aa = null;

        Throwable k = null;
        try {
            if (aa == null)
                throw new ArrayIndexOutOfBoundsException("pp");
        } catch (ArrayIndexOutOfBoundsException e) {
            k = e;
            e.addSuppressed(e);
            throw new NullPointerException("wwww");
        } finally {
            try {
                aa.length();
            } catch (NullPointerException e) {

                System.out.println(k);
                e.addSuppressed(k);
                Throwable[] arr = e.getSuppressed();

                for(int idx = 0; idx < arr.length; idx++)
                {
                    System.out.println("kk");arr[idx].printStackTrace();
                }

                throw new ArrayIndexOutOfBoundsException("kkkk");
            }
        }

        return 0;
    }
}
