package InnerClass;

/**
 * Created by manishasingh on 7/27/2017.
 */
public class BestInnerClassExample {

    int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    public MyIterator iterator()
    {
        return new MyIterator();
    }

    interface Itr{

    }
    public class MyIterator implements Itr{

        private int nextIdx = 0;

        public boolean hasNext() {
            if (nextIdx < arr.length - 1)
                return true;

            return false;
        }

        public Object next()
        {
            Object str = arr[nextIdx];
            nextIdx++;
            return str;
        }
    }
}
