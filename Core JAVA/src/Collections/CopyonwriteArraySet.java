package Collections;

import javax.xml.transform.sax.SAXSource;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * Created by manishasingh on 8/21/2017.
 */
public class CopyonwriteArraySet {
    public static void main(String[] args) {
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        copyOnWriteArraySet.add("manisha");
        copyOnWriteArraySet.add("singh");
        copyOnWriteArraySet.add("manisha");

        System.out.println(copyOnWriteArraySet);
    }
}
