package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;

/**
 * Created by manishasingh on 8/1/2017.
 */
public class Vector {
    /* All Methods are synchronized. */
    public static void main(String[] args) {
        practice2();
    }

    public static void practice0()
    {
        /**
         * If structure is modified at any time after Iterator is created , it will throw ConcurrentModificationException
         */
        java.util.Vector vector = new java.util.Vector();

        vector.add("oo");
        try {
            vector.add(12, "pp");
        }
        catch(Exception e){}

        Iterator itr = vector.iterator();

        while(itr.hasNext())
        {
            vector.add("ss");
            System.out.println(itr.next());
        }

    }

    public static void practice01()
    {
        /**
         * If structure is modified at any time after Iterator is created , it will throw ConcurrentModificationException
         */
        java.util.Vector vector = new java.util.Vector();

        try {
            vector.add(12, "pp");
        }
        catch(Exception e){}

        Iterator itr = vector.iterator();

        while(itr.hasNext())
        {
            vector.remove("ss");
            System.out.println(itr.next());
        }

    }

    public static void practice1()
    {
        /* Shift element to right. */
        java.util.Vector v = new java.util.Vector();
        v.add("pp");
        v.add("aa");
        v.add(1, "cc");

        System.out.println(v);
    }

    public static void practice2()
    {
        java.util.Vector v = new java.util.Vector();

        ArrayList l = new ArrayList();
        l.add("oo");
        l.add("ff");
        v.add("pp");
        v.add("aa");
        v.add("oo");
        v.add(1, l);

        ArrayList l1 = new ArrayList();
        l1.add("oo");
        l1.add("ff");
//        l1.add(l);

        boolean pp = v.removeAll(l1);
        System.out.println("pp = " + pp + ", List = " + v);
    }

    public static void practice3()
    {
        java.util.Vector<Integer> v = new java.util.Vector<Integer>();

        v.add(new Integer(2));
        v.remove(2);

        System.out.println(v);

    }
}
