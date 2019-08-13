package Collections;

import java.util.*;
import java.util.Vector;

/**
 * Created by manishasingh on 8/1/2017.
 */
public class ArrayList {
    public static void main(String[] args) {
        practice1();
    }

    public static void practice1() {

        java.util.Vector v = new Vector();
        v.add(1);
        v.add("ff");
        java.util.ArrayList list = new java.util.ArrayList(v);
        list.add("oo");

        java.util.Vector v1 = new Vector();
        v1.add("pp");
        v1.add("ff");

        list.addAll(0, v1);

        System.out.println(list);
        Iterator i = list.iterator();

        while(i.hasNext())
        {
            /* Cannot remove first. It remove by index. index increase in i.next. will throw IllegalStateException.*/
            i.remove();
            i.next();
        }

//        ListIterator i = list.listIterator();
//
//        while(i.hasNext())
//        {
//            i.next();
//        }
//
//        System.out.println(list);
    }
}


