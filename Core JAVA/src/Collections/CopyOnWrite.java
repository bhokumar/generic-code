package Collections;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by manishasingh on 8/14/2017.
 */
public class CopyOnWrite {
    public static void main(String[] args) {
        CopyOnWriteArrayList list = new CopyOnWriteArrayList();
        list.add("ss");
        list.add("aa");
        list.add(null);
//        ListIterator itr = list.listIterator();
//
//        /* CopyOnWrite ArrayList do not support iterator to add or remove. */
//        while (itr.hasNext()) {
//            itr.next();
//            itr.add("pp");
//        }

    }
}
